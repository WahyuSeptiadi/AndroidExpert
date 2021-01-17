package com.codeart.filmskuy.core.data.source.local

import androidx.lifecycle.LiveData
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
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
}