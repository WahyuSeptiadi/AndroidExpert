package com.codeart.filmskuy.detail

import android.content.Intent
import android.graphics.text.LineBreaker
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
import com.codeart.filmskuy.tvshow.TvShowViewModel
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class DetailTvShowActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_ID = "extra_id"
        const val FAVORITE_TYPE = "favorite_type"
    }

    private val detailViewModel: DetailViewModel by viewModel()
    private lateinit var binding: ActivityDetailBinding

    private val tvShowViewModel: TvShowViewModel by viewModel()

    private val similarListAdapter = SimilarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailCatalogue = intent.getParcelableExtra<CatalogueModel>(EXTRA_DATA)
        showDetailTvShow(detailCatalogue)

        val id: String = intent.getStringExtra(EXTRA_ID).toString()
        val fav: Int = intent.getIntExtra(FAVORITE_TYPE, 0)
        getSimilarTvShow(id, fav)

        setRecyclerViewSimilarTvShow()

        binding.btnBack.setOnClickListener {
            onBackPressed()
            finish()
        }
    }

    private fun startSkeletonShimmer() {
        with(binding) {
            imageDetailFilm.startLoading()
            backgroundDetailFilm.startLoading()
            ratingDetailFilm.startLoading()
            releaseDetailFilm.startLoading()
            titleDetailFilm.startLoading()
            overviewDetailFilm.startLoading()
        }
    }

    private fun stopSkeletonShimmer() {
        with(binding) {
            imageDetailFilm.stopLoading()
            backgroundDetailFilm.stopLoading()
            ratingDetailFilm.stopLoading()
            releaseDetailFilm.stopLoading()
            titleDetailFilm.stopLoading()
            overviewDetailFilm.stopLoading()
        }
    }

    private fun setRecyclerViewSimilarTvShow() {
        similarListAdapter.onItemClick = { selected ->
            val intent = Intent(this, DetailTvShowActivity::class.java)
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

    private fun getSimilarTvShow(id: String, type: Int) {
        startSkeletonShimmer()
        if (type != 1) {
            binding.similarTitle.visible()
            detailViewModel.getSimilarTvShow(id).observe(this, { tv ->
                when (tv) {
                    is Resource.Loading -> binding.similarTitle.text =
                        resources.getString(R.string.similar_tv_show_searching)
                    is Resource.Success -> {
                        if (tv.data.isNullOrEmpty()) {
                            toast(resources.getString(R.string.similar_not_found))
                            getTvShowPopular()
                        } else {
                            binding.similarTitle.text = resources.getString(R.string.similar_title)
                            similarListAdapter.setData(tv.data)
                        }
                        stopSkeletonShimmer()
                        binding.shimmer.gone()
                    }
                    is Resource.Error -> {
                        toast("Check Your Connection!")
                    }
                }
            })
        } else {
            binding.similarTitle.gone()
            binding.shimmer.gone()
            stopSkeletonShimmer()
        }
    }

    private fun getTvShowPopular() {
        tvShowViewModel.tvShow.observe(this, { tvShow ->
            if (tvShow != null) {
                when (tvShow) {
                    is Resource.Loading -> binding.similarTitle.text =
                        resources.getString(R.string.similar_tv_show_searching)
                    is Resource.Success -> {
                        binding.similarTitle.text = resources.getString(R.string.similar_title)
                        similarListAdapter.setData(tvShow.data)
                    }
                    is Resource.Error -> {
                        binding.similarTitle.gone()
                        toast("Check Your Connection!")
                    }
                }
            }
        })
    }

    private fun showDetailTvShow(catalogueModel: CatalogueModel?) {
        catalogueModel?.let {
            binding.titleDetailFilm.text = catalogueModel.entry
            binding.overviewDetailFilm.text = catalogueModel.overview
            binding.releaseDetailFilm.text = catalogueModel.date
            binding.ratingDetailFilm.text = catalogueModel.voteAverage.toString()

            val imageSizePoster = getString(R.string.size_url_poster_detail)
            val imageSizeBackdrop = getString(R.string.size_url_image_backdrop)
            val urlPoster = "$IMAGE_URL_BASE_PATH$imageSizePoster${catalogueModel.posterPath}"
            val urlBackdrop = "$IMAGE_URL_BASE_PATH$imageSizeBackdrop${catalogueModel.backdropPath}"

            Glide.with(this@DetailTvShowActivity)
                .load(urlPoster)
                .placeholder(R.drawable.loadings)
                .error(R.drawable.img_notfound)
                .into(binding.imageDetailFilm)

            Glide.with(this@DetailTvShowActivity)
                .load(urlBackdrop)
                .placeholder(R.drawable.loadings)
                .error(R.drawable.img_notfound)
                .into(binding.backgroundDetailFilm)

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
                detailViewModel.setFavoriteTvShow(catalogueModel, statusFavorite)
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