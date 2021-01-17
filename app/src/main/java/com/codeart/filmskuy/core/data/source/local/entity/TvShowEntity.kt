package com.codeart.filmskuy.core.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

@Entity(tableName = "tv_show_favorite")
data class TvShowEntity (
    val popular: Boolean? = null,
    val favorite: Boolean,
    @PrimaryKey
    val id: Int,
    val overview: String,
    @ColumnInfo(name = "poster_path")
    val posterPath: String? = null,
    @ColumnInfo(name = "first_air_date")
    val firstAirDate: String? = null,
    val name: String,
    @ColumnInfo(name = "vote_average")
    val voteAverage: Double
)