package com.codeart.filmskuy.core.data.source.local

import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import com.codeart.filmskuy.core.data.source.local.room.CatalogueDao
import kotlinx.coroutines.flow.Flow

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class LocalDataSource(private val catalogueDao: CatalogueDao) {

    fun getAllMovie(): Flow<List<MovieEntity>> = catalogueDao.getAllMoviePopular()
    fun getAllTvShow(): Flow<List<TvShowEntity>> = catalogueDao.getAllTvShowPopular()

    suspend fun insertMovie(movieList: List<MovieEntity>) = catalogueDao.insertMovie(movieList)
    suspend fun insertTvShow(tvShowList: List<TvShowEntity>) = catalogueDao.insertTvShow(tvShowList)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        catalogueDao.updateFavoriteMovie(movie)
    }

    fun setFavoriteTvShow(tvShow: TvShowEntity, newState: Boolean) {
        tvShow.isFavorite = newState
        catalogueDao.updateFavoriteTvShow(tvShow)
    }

    fun getFavoriteMovie(): Flow<List<MovieEntity>> = catalogueDao.getFavoriteMovie()
    fun getFavoriteTvShow(): Flow<List<TvShowEntity>> = catalogueDao.getFavoriteTvShow()

    fun getSearchMovie(title: String) = catalogueDao.getSearchMovieByTitle(title)
    fun getSearchTvShow(name: String) = catalogueDao.getSearchTvShowByName(name)

    fun getMovieSimilar(id: String) = catalogueDao.getMovieSimilar(id)
    fun getTvShowSimilar(id: String) = catalogueDao.getTvShowSimilar(id)

    suspend fun deleteAllUnFavoriteMovie(id: String) = catalogueDao.deleteAllUnFavoriteMovie(id)
    suspend fun deleteAllUnFavoriteTvShow(id: String) = catalogueDao.deleteAllUnFavoriteTvShow(id)

    suspend fun getCountMovie(): Int = catalogueDao.getCountMovie()
    suspend fun getCountTvShow(): Int = catalogueDao.getCountTvShow()
}