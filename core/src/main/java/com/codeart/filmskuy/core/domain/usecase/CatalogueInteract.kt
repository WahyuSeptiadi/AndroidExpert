package com.codeart.filmskuy.core.domain.usecase

import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.domain.repository.ICatalogueRepository

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueInteract(private val iCatalogueRepository: ICatalogueRepository) :
    CatalogueUseCase {
    override fun getAllMovieCatalogue() = iCatalogueRepository.getAllMovieCatalogue()
    override fun getAllTvShowCatalogue() = iCatalogueRepository.getAllTvShowCatalogue()

    override fun setFavoriteMovieCatalogue(catalogueModel: CatalogueModel, state: Boolean) =
        iCatalogueRepository.setFavoriteMovieCatalogue(catalogueModel, state)

    override fun setFavoriteTvShowCatalogue(catalogueModel: CatalogueModel, state: Boolean) =
        iCatalogueRepository.setFavoriteTvShowCatalogue(catalogueModel, state)

    override fun getFavoriteMovie() = iCatalogueRepository.getFavoriteMovie()
    override fun getFavoriteTvShow() = iCatalogueRepository.getFavoriteTvShow()

    override fun getSearchMovieByTitle(title: String) =
        iCatalogueRepository.getSearchMovieByTitle(title)

    override fun getSearchTvShowByName(name: String) =
        iCatalogueRepository.getSearchTvShowByName(name)

    override fun getSimilarMovieList(id: String) =
        iCatalogueRepository.getSimilarMovieById(id)

    override fun getSimilarTvShowList(id: String) =
        iCatalogueRepository.getSimilarTvShowById(id)
}