package com.codeart.filmskuy.movie

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import androidx.recyclerview.widget.GridLayoutManager
import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.ui.CatalogueListAdapter
import com.codeart.filmskuy.core.utils.gone
import com.codeart.filmskuy.core.utils.hideKeyboard
import com.codeart.filmskuy.core.utils.toast
import com.codeart.filmskuy.core.utils.visible
import com.codeart.filmskuy.databinding.FragmentMovieBinding
import com.codeart.filmskuy.detail.DetailMovieActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by viewModel()

    private lateinit var _binding: FragmentMovieBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            with(binding) {
                val catalogueListAdapter = CatalogueListAdapter()

                catalogueListAdapter.onItemClick = { selectedData ->
                    val intent = Intent(activity, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_DATA, selectedData)
                    startActivity(intent)
                }

                getAllMovie(catalogueListAdapter)

                refreshMovie.setOnClickListener {
                    movieNotFound.gone()
                    refreshMovie.gone()
                    getAllMovie(catalogueListAdapter)
                }

                etSearchMovie.setOnEditorActionListener { _, actionId, _ ->
                    if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                        val titleKey = etSearchMovie.text

                        progressMovie.visible()

                        if (titleKey.isNotEmpty()) {
                            movieViewModel.getAllMovieByTitle(titleKey.toString())
                                .observe(viewLifecycleOwner, { movie ->
                                    if (movie != null) {
                                        movieNotFound.gone()
                                        refreshMovie.gone()
                                        when (movie) {
                                            is Resource.Loading -> binding.progressMovie.visible()
                                            is Resource.Success -> {
                                                if (movie.data?.isEmpty() == true) {
                                                    movieNotFound.visible()
                                                    refreshMovie.visible()
                                                }
                                                progressMovie.gone()
                                                catalogueListAdapter.setData(movie.data)
                                            }
                                            is Resource.Error -> {
                                                progressMovie.gone()
                                                refreshMovie.visible()
                                                toast("Check Your Connection!")
                                            }
                                        }
                                    }
                                })
                        } else {
                            progressMovie.gone()
                            toast("Please, Enter Keyword!")
                        }
                        titleKey.clear()
                        hideKeyboard()
                        return@setOnEditorActionListener true
                    }
                    false
                }

                with(rvMovie) {
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

    private fun getAllMovie(adapter: CatalogueListAdapter) {
        movieViewModel.movie.observe(viewLifecycleOwner, { movie ->
            if (movie != null) {
                when (movie) {
                    is Resource.Loading -> binding.progressMovie.gone()
                    is Resource.Success -> {
                        binding.progressMovie.gone()
                        adapter.setData(movie.data)
                    }
                    is Resource.Error -> {
                        binding.progressMovie.gone()
                        toast("Check Your Connection!")
                    }
                }
            }
        })
    }
}