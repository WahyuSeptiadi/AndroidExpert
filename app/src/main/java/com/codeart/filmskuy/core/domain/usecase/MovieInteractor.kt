package com.codeart.filmskuy.core.domain.usecase

import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class MovieInteractor(private val iCatalogueRepository: ICatalogueRepository): MovieUsecase{
    override fun getAllMovie() = iCatalogueRepository.getAllMovieCatalogue()
}