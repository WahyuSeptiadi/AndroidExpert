package com.codeart.filmskuy.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class DetailViewModel(private val catalogueUsecase: CatalogueUsecase) : ViewModel() {
    fun setFavoriteMovie(catalogue: CatalogueModel, newStatus: Boolean) =
        catalogueUsecase.setFavoriteMovieCatalogue(catalogue, newStatus)

    fun setFavoriteTvShow(catalogue: CatalogueModel, newStatus: Boolean) =
        catalogueUsecase.setFavoriteTvShowCatalogue(catalogue, newStatus)

    fun getSimilarMovie(id: String) = catalogueUsecase.getSimilarMovieList(id).asLiveData()
}