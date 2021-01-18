package com.codeart.filmskuy.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class TvShowViewModel(catalogueUsecase: CatalogueUsecase) : ViewModel() {
    val tvShow = catalogueUsecase.getAllTvShowCatalogue().asLiveData()
}