package com.codeart.filmskuy.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.usecase.CatalogueUseCase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class DetailViewModel(private val catalogueUseCase: CatalogueUseCase) : ViewModel() {
    fun setFavoriteMovie(catalogue: CatalogueModel, newStatus: Boolean) =
        catalogueUseCase.setFavoriteMovieCatalogue(catalogue, newStatus)

    fun setFavoriteTvShow(catalogue: CatalogueModel, newStatus: Boolean) =
        catalogueUseCase.setFavoriteTvShowCatalogue(catalogue, newStatus)

    fun getSimilarMovie(id: String) = catalogueUseCase.getSimilarMovieList(id).asLiveData()
    fun getSimilarTvShow(id: String) = catalogueUseCase.getSimilarTvShowList(id).asLiveData()
}