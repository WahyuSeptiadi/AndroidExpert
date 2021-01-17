package com.codeart.filmskuy.core.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Dao
interface CatalogueDao {
    @Query("SELECT * FROM movie_favorite")
    fun getAllMovie(): LiveData<List<MovieEntity>>

    @Query("SELECT * FROM movie_favorite where favorite = 1")
    fun getFavoriteMovie(): LiveData<List<MovieEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(tourism: List<MovieEntity>)

    @Update
    fun updateFavoriteMovie(tourism: MovieEntity)
}