package com.codeart.filmskuy.detail

import android.graphics.text.LineBreaker
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.ui.ViewModelFactory
import com.codeart.filmskuy.core.utils.IMAGE_URL_BASE_PATH
import com.codeart.filmskuy.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var detailViewModel: DetailViewModel
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(this)
        detailViewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

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

            if (catalogueModel.posterPath != null) {
                val imageSize = getString(R.string.size_url_image_list)
                val urlImage = "$IMAGE_URL_BASE_PATH$imageSize${catalogueModel.posterPath}"
                Glide.with(this@DetailActivity)
                    .load(urlImage)
                    .placeholder(R.drawable.loading)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailActivity)
                    .load(urlImage)
                    .placeholder(R.drawable.loading)
                    .into(binding.backgroundDetailFilm)
            } else {
                Glide.with(this@DetailActivity)
                    .load(R.drawable.img_notfound)
                    .placeholder(R.drawable.loading)
                    .into(binding.imageDetailFilm)
                Glide.with(this@DetailActivity)
                    .load(R.drawable.img_notfound)
                    .placeholder(R.drawable.loading)
                    .into(binding.backgroundDetailFilm)
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    binding.overviewDetailFilm.justificationMode =
                        LineBreaker.JUSTIFICATION_MODE_INTER_WORD
                }
            }

//            var statusFavorite = catalogueModel.isFavorite
//            setStatusFavorite(statusFavorite)
//            binding.fab.setOnClickListener {
//                statusFavorite = !statusFavorite
//                detailViewModel.setFavoriteCatalogue(catalogueModel, statusFavorite)
//                setStatusFavorite(statusFavorite)
//            }
        }
    }
}