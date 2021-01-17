package com.codeart.filmskuy.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.ui.ViewModelFactory
import com.codeart.filmskuy.databinding.FragmentTvShowBinding

class TvShowFragment : Fragment() {

    private lateinit var tvShowViewModel: TvShowViewModel

    private var _binding: FragmentTvShowBinding? = null
    private val binding get() = _binding!!

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
            val tvShowListAdapter = TvShowListAdapter()
            tvShowListAdapter.onItemClick = {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show()
            }

            val factory = ViewModelFactory.getInstance(requireContext())
            tvShowViewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]

            tvShowViewModel.tvShow.observe(viewLifecycleOwner, { tvShow ->
                if (tvShow != null) {
                    when (tvShow) {
                        is Resource.Loading -> binding.progressTvShow.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.progressTvShow.visibility = View.GONE
                            tvShowListAdapter.setData(tvShow.data)
                        }
                        is Resource.Error -> {
                            binding.progressTvShow.visibility = View.GONE
                            Toast.makeText(context, "ERROR", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(binding.rvTvShow) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = tvShowListAdapter
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}