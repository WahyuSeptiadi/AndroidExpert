package com.codeart.filmskuy.core.data.source.remote.network

import com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse
import com.codeart.filmskuy.core.utils.API_URL_LAST
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

interface ApiService {
    @GET("3/discover/movie/$API_URL_LAST")
    fun getMovies(): Call<MovieListResponse>

    @GET("3/discover/tv/$API_URL_LAST")
    fun getTvShows(): Call<TvShowListResponse>
}