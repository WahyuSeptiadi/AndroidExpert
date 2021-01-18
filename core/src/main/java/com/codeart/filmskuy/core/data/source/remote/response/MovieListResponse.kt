package com.codeart.filmskuy.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

data class MovieListResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movieResultRespons: List<MovieResultResponse>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)