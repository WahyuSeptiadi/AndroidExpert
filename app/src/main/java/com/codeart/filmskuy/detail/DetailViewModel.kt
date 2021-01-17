package com.codeart.filmskuy.detail

import androidx.lifecycle.ViewModel
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class DetailViewModel(private val catalogueUsecase: CatalogueUsecase) : ViewModel() {
    fun setFavoriteCatalogue(catalogue: CatalogueModel, newStatus: Boolean) =
        catalogueUsecase.setFavoriteMovieCatalogue(catalogue, newStatus)
}