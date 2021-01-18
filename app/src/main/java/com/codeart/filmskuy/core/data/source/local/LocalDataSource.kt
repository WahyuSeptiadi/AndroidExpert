package com.codeart.filmskuy.core.data.source.local

import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import com.codeart.filmskuy.core.data.source.local.room.CatalogueDao
import kotlinx.coroutines.flow.Flow

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class LocalDataSource private constructor(private val catalogueDao: CatalogueDao) {
    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(catalogueDao: CatalogueDao): LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(catalogueDao)
            }
    }

    fun getAllMovie(): Flow<List<MovieEntity>> = catalogueDao.getAllMovie()

    fun insertMovie(movieList: List<MovieEntity>) = catalogueDao.insertMovie(movieList)

    fun getAllTvShow(): Flow<List<TvShowEntity>> = catalogueDao.getAllTvShow()

    fun insertTvShow(tvShowList: List<TvShowEntity>) = catalogueDao.insertTvShow(tvShowList)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        catalogueDao.updateFavoriteMovie(movie)
    }

    fun setFavoriteTvShow(tvShow: TvShowEntity, newState: Boolean) {
        tvShow.isFavorite = newState
        catalogueDao.updateFavoriteTvShow(tvShow)
    }

    fun getFavoriteMovie(): Flow<List<MovieEntity>> = catalogueDao.getFavoriteMovie()
}