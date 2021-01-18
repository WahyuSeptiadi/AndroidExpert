package com.codeart.filmskuy.core.domain.usecase

import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueInteractor(private val iCatalogueRepository: ICatalogueRepository) :
    CatalogueUsecase {
    override fun getAllMovieCatalogue() = iCatalogueRepository.getAllMovieCatalogue()
    override fun getAllTvShowCatalogue() = iCatalogueRepository.getAllTvShowCatalogue()
    override fun setFavoriteMovieCatalogue(catalogueModel: CatalogueModel, state: Boolean) =
        iCatalogueRepository.setFavoriteMovieCatalogue(catalogueModel, state)
    override fun setFavoriteTvShowCatalogue(catalogueModel: CatalogueModel, state: Boolean) =
        iCatalogueRepository.setFavoriteTvShowCatalogue(catalogueModel, state)
    override fun getFavoriteMovie() = iCatalogueRepository.getFavoriteMovie()
    override fun getFavoriteTvShow() = iCatalogueRepository.getFavoriteTvShow()
}