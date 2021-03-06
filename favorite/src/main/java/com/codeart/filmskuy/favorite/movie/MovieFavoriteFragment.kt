package com.codeart.filmskuy.favorite.movie

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.codeart.filmskuy.core.ui.CatalogueListAdapter
import com.codeart.filmskuy.core.utils.gone
import com.codeart.filmskuy.detail.DetailMovieActivity
import com.codeart.filmskuy.favorite.databinding.FragmentMovieFavoriteBinding
import com.codeart.filmskuy.favorite.di.favoriteModule
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class MovieFavoriteFragment : Fragment() {

    private val movieFavoriteViewModel: MovieFavoriteViewModel by viewModel()

    private lateinit var _binding: FragmentMovieFavoriteBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loadKoinModules(favoriteModule)

        _binding = FragmentMovieFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.movieFragment.setBackgroundColor(Color.parseColor("#00294A"))
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val catalogueListAdapter = CatalogueListAdapter()

            catalogueListAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailMovieActivity::class.java)
                intent.putExtra(DetailMovieActivity.EXTRA_DATA, selectedData)
                intent.putExtra(DetailMovieActivity.FAVORITE_TYPE, 1)
                startActivity(intent)
            }

            movieFavoriteViewModel.movieFavorite.observe(viewLifecycleOwner, { movieFav ->
                if (movieFav != null) {
                    binding.progressMovieFavorite.gone()
                    catalogueListAdapter.setData(movieFav)
                    binding.movieFavoriteEmpty.visibility =
                        if (movieFav.isNotEmpty()) View.INVISIBLE else View.VISIBLE
                }
            })

            with(binding.rvFavMovie) {
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