package com.codeart.filmskuy.detail

import android.graphics.text.LineBreaker
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.utils.IMAGE_URL_BASE_PATH
import com.codeart.filmskuy.databinding.ActivityDetailBinding
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class DetailTvShowActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private val detailViewModel: DetailViewModel by viewModel()
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detailCatalogue = intent.getParcelableExtra<CatalogueModel>(EXTRA_DATA)
        showDetailTourism(detailCatalogue)

        binding.btnBack.setOnClickListener {
            onBackPressed()
            finish()
        }
    }

    private fun showDetailTourism(catalogueModel: CatalogueModel?) {
        catalogueModel?.let {
            binding.titleDetailFilm.text = catalogueModel.entry
            binding.overviewDetailFilm.text = catalogueModel.overview
            binding.releaseDetailFilm.text = catalogueModel.date
            binding.ratingDetailFilm.text = catalogueModel.voteAverage.toString()

            val imageSizePoster = getString(R.string.size_url_image_poster)
            val imageSizeBackdrop = getString(R.string.size_url_image_backdrop)
            val urlPoster = "$IMAGE_URL_BASE_PATH$imageSizePoster${catalogueModel.posterPath}"
            val urlBackdrop = "$IMAGE_URL_BASE_PATH$imageSizeBackdrop${catalogueModel.backdropPath}"

            if (catalogueModel.posterPath != null) {
                Glide.with(this@DetailTvShowActivity)
                    .load(urlPoster)
                    .placeholder(R.drawable.loadings)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailTvShowActivity)
                    .load(urlBackdrop)
                    .placeholder(R.drawable.loadings)
                    .into(binding.backgroundDetailFilm)
            } else {
                Glide.with(this@DetailTvShowActivity)
                    .load(R.drawable.img_notfound)
                    .placeholder(R.drawable.loadings)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailTvShowActivity)
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
                detailViewModel.setFavoriteTvShow(catalogueModel, statusFavorite)
                setStatusFavorite(statusFavorite)
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        if (statusFavorite) {
            binding.fab.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorite_white))
        } else {
            binding.fab.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_not_favorite_white))
        }
    }
}