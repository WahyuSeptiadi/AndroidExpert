package com.codeart.filmskuy.detail

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.ui.SimilarListAdapter
import com.codeart.filmskuy.core.utils.IMAGE_URL_BASE_PATH
import com.codeart.filmskuy.core.utils.gone
import com.codeart.filmskuy.core.utils.toast
import com.codeart.filmskuy.core.utils.visible
import com.codeart.filmskuy.databinding.ActivityDetailBinding
import com.codeart.filmskuy.movie.MovieViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_ID = "extra_id"
        const val FAVORITE_TYPE = "favorite_type"
    }

    private val detailViewModel: DetailViewModel by viewModel()
    private lateinit var binding: ActivityDetailBinding

    private val movieViewModel: MovieViewModel by viewModel()

    private val similarListAdapter = SimilarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailCatalogue = intent.getParcelableExtra<CatalogueModel>(EXTRA_DATA)
        showDetailMovie(detailCatalogue)

        val id: String = intent.getStringExtra(EXTRA_ID).toString()
        val fav: Int = intent.getIntExtra(FAVORITE_TYPE, 0)
        getSimilarMovie(id, fav)

        setRecyclerViewSimilarMovie()

        binding.btnBack.setOnClickListener {
            onBackPressed()
            finish()
        }
    }

    private fun setRecyclerViewSimilarMovie() {
        similarListAdapter.onItemClick = { selected ->
            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra(EXTRA_ID, selected.id.toString())
            intent.putExtra(EXTRA_DATA, selected)
            startActivity(intent)
            finish()
        }

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        with(binding) {
            rvSimilar.layoutManager = layoutManager
            rvSimilar.hasFixedSize()
            rvSimilar.adapter = similarListAdapter
        }
    }

    private fun getSimilarMovie(id: String, type: Int) {
        if (type != 1) {
            binding.similarTitle.visible()
            detailViewModel.getSimilarMovie(id).observe(this, { movie ->
                when (movie) {
                    is Resource.Loading -> binding.similarTitle.text =
                        resources.getString(R.string.similar_movie_searching)
                    is Resource.Success -> {
                        if (movie.data.isNullOrEmpty()) {
                            getMoviePopular()
                        } else {
                            binding.similarTitle.text = resources.getString(R.string.similar_title)
                            similarListAdapter.setData(movie.data)
                        }
                    }
                    is Resource.Error -> {
                        binding.similarTitle.gone()
                        toast("Check Your Connection!")
                    }
                }
            })
        } else {
            binding.similarTitle.gone()
        }
    }

    private fun getMoviePopular() {
        movieViewModel.movie.observe(this, { movie ->
            if (movie != null) {
                when (movie) {
                    is Resource.Loading -> binding.similarTitle.text =
                        resources.getString(R.string.similar_movie_searching)
                    is Resource.Success -> {
                        binding.similarTitle.text = resources.getString(R.string.similar_title)
                        similarListAdapter.setData(movie.data)
                    }
                    is Resource.Error -> {
                        binding.similarTitle.gone()
                        toast("Check Your Connection!")
                    }
                }
            }
        })
    }

    private fun showDetailMovie(catalogueModel: CatalogueModel?) {
        catalogueModel?.let {
            binding.fab.visible()
            binding.titleDetailFilm.text = catalogueModel.entry
            binding.overviewDetailFilm.text = catalogueModel.overview
            binding.releaseDetailFilm.text = catalogueModel.date
            binding.ratingDetailFilm.text = catalogueModel.voteAverage.toString()

            val imageSizePoster = getString(R.string.size_url_poster_detail)
            val imageSizeBackdrop = getString(R.string.size_url_image_backdrop)
            val urlPoster =
                "$IMAGE_URL_BASE_PATH$imageSizePoster${catalogueModel.posterPath}"
            val urlBackdrop =
                "$IMAGE_URL_BASE_PATH$imageSizeBackdrop${catalogueModel.backdropPath}"

            if (catalogueModel.posterPath != null) {
                Glide.with(this@DetailMovieActivity)
                    .load(urlPoster)
                    .placeholder(R.drawable.loadings)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailMovieActivity)
                    .load(urlBackdrop)
                    .placeholder(R.drawable.loadings)
                    .into(binding.backgroundDetailFilm)
            } else {
                Glide.with(this@DetailMovieActivity)
                    .load(R.drawable.img_notfound)
                    .placeholder(R.drawable.loadings)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailMovieActivity)
                    .load(R.drawable.img_notfound)
                    .placeholder(R.drawable.loadings)
                    .into(binding.backgroundDetailFilm)
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    binding.overviewDetailFilm.justificationMode =
                        LineBreaker.JUSTIFICATION_MODE_INTER_WORD
                }
            }

            var statusFavorite = catalogueModel.isFavorite
            setStatusFavorite(statusFavorite)
            binding.fab.setOnClickListener {
                statusFavorite = !statusFavorite
                detailViewModel.setFavoriteMovie(catalogueModel, statusFavorite)
                setStatusFavorite(statusFavorite)
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.fab.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_favorite_white
                )
            )
        } else {
            binding.fab.setImageDrawable(
                ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_not_favorite_white
                )
            )
        }
    }
}