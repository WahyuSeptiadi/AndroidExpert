package com.codeart.filmskuy.core.data.source.local

import androidx.lifecycle.LiveData
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import com.codeart.filmskuy.core.data.source.local.room.CatalogueDao

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

    fun getAllMovie(): LiveData<List<MovieEntity>> = catalogueDao.getAllMovie()

    fun insertMovie(movieList: List<MovieEntity>) = catalogueDao.insertMovie(movieList)

    fun getAllTvShow(): LiveData<List<TvShowEntity>> = catalogueDao.getAllTvShow()

    fun insertTvShow(tvShowList: List<TvShowEntity>) = catalogueDao.insertTvShow(tvShowList)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        catalogueDao.updateFavoriteMovie(movie)
    }
}