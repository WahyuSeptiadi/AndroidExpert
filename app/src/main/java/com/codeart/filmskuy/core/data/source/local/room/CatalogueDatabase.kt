package com.codeart.filmskuy.core.data.source.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codeart.filmskuy.core.data.source.local.entity.MovieEntity

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Database(entities = [MovieEntity::class], version = 1, exportSchema = false)
abstract class CatalogueDatabase : RoomDatabase() {
    abstract fun movieDao(): CatalogueDao

    companion object {
        @Volatile
        private var INSTANCE: CatalogueDatabase? = null

        fun getInstance(context: Context): CatalogueDatabase =
            INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CatalogueDatabase::class.java,
                    "Catalogue.db"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
    }
}