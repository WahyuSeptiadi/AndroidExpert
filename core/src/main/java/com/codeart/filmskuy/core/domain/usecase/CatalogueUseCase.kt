package com.codeart.filmskuy.core.domain.usecase

import com.codeart.filmskuy.core.data.source.Resource
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import kotlinx.coroutines.flow.Flow

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

interface CatalogueUseCase {
    fun getAllMovieCatalogue(): Flow<Resource<List<CatalogueModel>>>
    fun getAllTvShowCatalogue(): Flow<Resource<List<CatalogueModel>>>
    fun setFavoriteMovieCatalogue(catalogueModel: CatalogueModel, state: Boolean)
    fun setFavoriteTvShowCatalogue(catalogueModel: CatalogueModel, state: Boolean)
    fun getFavoriteMovie(): Flow<List<CatalogueModel>>
    fun getFavoriteTvShow(): Flow<List<CatalogueModel>>
    fun getSearchMovieByTitle(title: String): Flow<Resource<List<CatalogueModel>>>
    fun getSearchTvShowByName(name: String): Flow<Resource<List<CatalogueModel>>>
    fun getSimilarMovieList(id: String): Flow<Resource<List<CatalogueModel>>>
    fun getSimilarTvShowList(id: String): Flow<Resource<List<CatalogueModel>>>
}