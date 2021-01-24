package com.codeart.filmskuy.favorite.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.usecase.CatalogueUseCase

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class TvShowFavoriteViewModel(catalogueUseCase: CatalogueUseCase) : ViewModel() {
    val tvShowFavorite = catalogueUseCase.getFavoriteTvShow().asLiveData()
}