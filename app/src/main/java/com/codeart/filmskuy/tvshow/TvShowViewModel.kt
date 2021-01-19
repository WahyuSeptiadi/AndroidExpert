package com.codeart.filmskuy.tvshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.usecase.CatalogueUsecase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class TvShowViewModel(private val catalogueUseCase: CatalogueUsecase) : ViewModel() {
    private val percent = "%"
    val tvShow = catalogueUseCase.getAllTvShowCatalogue().asLiveData()

    fun getAllTvShowByName(name: String) =
        catalogueUseCase.getSearchTvShowByName(percent + name + percent).asLiveData()
}