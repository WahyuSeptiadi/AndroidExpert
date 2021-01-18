package com.codeart.filmskuy.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity
import com.codeart.filmskuy.core.data.source.local.entity.TvShowEntity

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Database(entities = [MovieEntity::class, TvShowEntity::class], version = 1, exportSchema = false)
abstract class CatalogueDatabase : RoomDatabase() {

    abstract fun catalogueDao(): CatalogueDao
}