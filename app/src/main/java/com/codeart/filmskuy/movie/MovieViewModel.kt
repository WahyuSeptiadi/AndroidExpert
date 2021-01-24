package com.codeart.filmskuy.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.codeart.filmskuy.core.domain.usecase.CatalogueUseCase

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class MovieViewModel(private val catalogueUseCase: CatalogueUseCase) : ViewModel() {
    private val percent = "%"
    val movie = catalogueUseCase.getAllMovieCatalogue().asLiveData()

    fun getAllMovieByTitle(title: String) =
        catalogueUseCase.getSearchMovieByTitle(percent + title + percent).asLiveData()
}