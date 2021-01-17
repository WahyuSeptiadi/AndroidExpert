package com.codeart.filmskuy.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

data class TvShowResultResponse(
    val id: Int,
    val name: String,
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("first_air_date")
    val firstAirDate: String? = null,
    @SerializedName("vote_average")
    val voteAverage: Double
)