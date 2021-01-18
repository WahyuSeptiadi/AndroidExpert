package com.codeart.filmskuy.core.data.source.local.room

import androidx.room.*
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Dao
interface CatalogueDao {
    @Query("SELECT * FROM movie_favorite")
    fun getAllMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite where isFavorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<MovieEntity>)

    @Update
    fun updateFavoriteMovie(movie: MovieEntity)

    @Query("SELECT * FROM tv_show_favorite")
    fun getAllTvShow(): Flow<List<TvShowEntity>>

    @Query("SELECT * FROM tv_show_favorite where isFavorite = 1")
    fun getFavoriteTvShow(): Flow<List<TvShowEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvShow(tvShow: List<TvShowEntity>)

    @Update
    fun updateFavoriteTvShow(tvShow: TvShowEntity)
}