package com.codeart.filmskuy.favorite.tvshow

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
import com.codeart.filmskuy.detail.DetailTvShowActivity
import com.codeart.filmskuy.favorite.databinding.FragmentTvShowFavoriteBinding
import com.codeart.filmskuy.favorite.di.favoriteModule
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class TvShowFavoriteFragment : Fragment() {

    private val tvShowFavoriteViewModel: TvShowFavoriteViewModel by viewModel()

    private lateinit var _binding: FragmentTvShowFavoriteBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loadKoinModules(favoriteModule)

        _binding = FragmentTvShowFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvShowFragment.setBackgroundColor(Color.parseColor("#00294A"))
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val catalogueListAdapter = CatalogueListAdapter()

            catalogueListAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailTvShowActivity::class.java)
                intent.putExtra(DetailTvShowActivity.EXTRA_DATA, selectedData)
                intent.putExtra(DetailTvShowActivity.FAVORITE_TYPE, 1)
                startActivity(intent)
            }

            tvShowFavoriteViewModel.tvShowFavorite.observe(viewLifecycleOwner, { tvShowFav ->
                if (tvShowFav != null) {
                    binding.progressTvShowFavorite.gone()
                    catalogueListAdapter.setData(tvShowFav)
                    binding.tvFavoriteEmpty.visibility =
                        if (tvShowFav.isNotEmpty()) View.INVISIBLE else View.VISIBLE
                }
            })

            with(binding.rvFavTvShow) {
                val orientation = resources.configuration.orientation
                layoutManager =
                    if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
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