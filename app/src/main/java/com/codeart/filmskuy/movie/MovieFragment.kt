package com.codeart.filmskuy.movie

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
import com.codeart.filmskuy.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private lateinit var movieViewModel: MovieViewModel

    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!

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
            val movieListAdapter = MovieListAdapter()
            movieListAdapter.onItemClick = {
                Toast.makeText(context, "coming soon", Toast.LENGTH_SHORT).show()
            }

            val factory = ViewModelFactory.getInstance(requireContext())
            movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

            movieViewModel.movie.observe(viewLifecycleOwner, { movie ->
                if (movie != null) {
                    when (movie) {
                        is Resource.Loading -> binding.progressMovie.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.progressMovie.visibility = View.GONE
                            movieListAdapter.setData(movie.data)
                        }
                        is Resource.Error -> {
                            binding.progressMovie.visibility = View.GONE
                            Toast.makeText(context, "ERROR", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(binding.rvMovie) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = movieListAdapter
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}