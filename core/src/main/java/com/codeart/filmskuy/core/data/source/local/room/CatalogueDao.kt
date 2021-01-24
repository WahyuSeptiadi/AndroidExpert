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
    @Query("SELECT * FROM movie_favorite WHERE popular = 1")
    fun getAllMoviePopular(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite WHERE isFavorite = 1")
    fun getFavoriteMovie(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite WHERE popular = 0 AND idSimilar = :id")
    fun getMovieSimilar(id: String): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite WHERE title LIKE :title")
    fun getSearchMovieByTitle(title: String): Flow<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: List<MovieEntity>)

    @Update
    fun updateFavoriteMovie(movie: MovieEntity)

    @Query("SELECT * FROM tv_show_favorite WHERE popular = 1")
    fun getAllTvShowPopular(): Flow<List<TvShowEntity>>

    @Query("SELECT * FROM tv_show_favorite WHERE isFavorite = 1")
    fun getFavoriteTvShow(): Flow<List<TvShowEntity>>

    @Query("SELECT * FROM tv_show_favorite WHERE name LIKE :name")
    fun getSearchTvShowByName(name: String): Flow<List<TvShowEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvShow(tvShow: List<TvShowEntity>)

    @Update
    fun updateFavoriteTvShow(tvShow: TvShowEntity)


}