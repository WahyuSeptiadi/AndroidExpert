package com.codeart.filmskuy.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Dao
interface CatalogueDao {
    @Query("SELECT * FROM movie_favorite")
    fun getAllMovie(): LiveData<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite where isFavorite = 1")
    fun getFavoriteMovie(): LiveData<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: List<MovieEntity>)

    @Update
    fun updateFavoriteMovie(movie: MovieEntity)

    @Query("SELECT * FROM tv_show_favorite")
    fun getAllTvShow(): LiveData<List<TvShowEntity>>

    @Query("SELECT * FROM tv_show_favorite where isFavorite = 1")
    fun getFavoriteTvShow(): LiveData<List<TvShowEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvShow(tvShow: List<TvShowEntity>)

    @Update
    fun updateFavoriteTvShow(tvShow: TvShowEntity)
}