package com.codeart.filmskuy.tvshow

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.ui.CatalogueListAdapter
import com.codeart.filmskuy.core.utils.gone
import com.codeart.filmskuy.core.utils.hideKeyboard
import com.codeart.filmskuy.core.utils.toast
import com.codeart.filmskuy.core.utils.visible
import com.codeart.filmskuy.databinding.FragmentTvShowBinding
import com.codeart.filmskuy.detail.DetailTvShowActivity
import org.koin.android.viewmodel.ext.android.viewModel

class TvShowFragment : Fragment() {

    private val tvShowViewModel: TvShowViewModel by viewModel()

    private lateinit var _binding: FragmentTvShowBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTvShowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            with(binding) {
                val catalogueListAdapter = CatalogueListAdapter()

                catalogueListAdapter.onItemClick = { selectedData ->
                    val intent = Intent(activity, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_ID, selectedData.id.toString())
                    intent.putExtra(DetailTvShowActivity.EXTRA_DATA, selectedData)
                    startActivity(intent)
                }

                getAllTvShow(catalogueListAdapter)

                refreshTv.setOnClickListener {
                    tvNotFound.gone()
                    refreshTv.gone()
                    getAllTvShow(catalogueListAdapter)
                }

                etSearchTvShow.setOnEditorActionListener { _, actionId, _ ->
                    if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                        val nameKey = etSearchTvShow.text

                        progressTvShow.visible()

                        if (nameKey.isNotEmpty()) {
                            tvShowViewModel.getAllTvShowByName(nameKey.toString())
                                .observe(viewLifecycleOwner, { tvShow ->
                                    if (tvShow != null) {
                                        tvNotFound.gone()
                                        refreshTv.gone()
                                        when (tvShow) {
                                            is Resource.Loading -> progressTvShow.visible()
                                            is Resource.Success -> {
                                                if (tvShow.data.isNullOrEmpty()) {
                                                    tvNotFound.visible()
                                                    refreshTv.visible()
                                                }
                                                progressTvShow.gone()
                                                catalogueListAdapter.setData(tvShow.data)
                                            }
                                            is Resource.Error -> {
                                                progressTvShow.gone()
                                                refreshTv.visible()
                                                toast("Check Your Connection!")
                                            }
                                        }
                                    }
                                })
                        } else {
                            progressTvShow.gone()
                            toast("Please, Enter Keyword!")
                        }

                        nameKey.clear()
                        hideKeyboard()
                        return@setOnEditorActionListener true
                    }
                    false
                }

                with(rvTvShow) {
                    val orientation = resources.configuration.orientation
                    layoutManager = if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        GridLayoutManager(context, 4)
                    } else {
                        GridLayoutManager(context, 2)
                    }
                    setHasFixedSize(true)
                    adapter = catalogueListAdapter
                }
            }
        }
    }

    private fun getAllTvShow(adapter: CatalogueListAdapter) {
        tvShowViewModel.tvShow.observe(viewLifecycleOwner, { tvShow ->
            if (tvShow != null) {
                when (tvShow) {
                    is Resource.Loading -> binding.progressTvShow.gone()
                    is Resource.Success -> {
                        binding.progressTvShow.gone()
                        adapter.setData(tvShow.data)
                    }
                    is Resource.Error -> {
                        binding.progressTvShow.gone()
                        toast("Check Your Connection!")
                    }
                }
            }
        })
    }
}