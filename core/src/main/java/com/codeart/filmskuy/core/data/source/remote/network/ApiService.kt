package com.codeart.filmskuy.core.data.source.remote.network

import com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse
import com.codeart.filmskuy.core.utils.API_SEARCH_LAST
import com.codeart.filmskuy.core.utils.API_URL_LAST
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

interface ApiService {
    @GET("discover/movie/$API_URL_LAST")
    suspend fun getMovies(): MovieListResponse

    @GET("discover/tv/$API_URL_LAST")
    suspend fun getTvShows(): TvShowListResponse

    @GET("search/movie$API_SEARCH_LAST")
    suspend fun searchMovie(
        @Query("query") title: String
    ): MovieListResponse

    @GET("search/tv$API_SEARCH_LAST")
    suspend fun searchTvShow(
        @Query("query") name: String
    ): TvShowListResponse

    @GET("movie/{movie_id}/similar$API_URL_LAST")
    suspend fun getSimilarMovie(
        @Path("movie_id") movieId: String
    ): MovieListResponse

    @GET("tv/{tv_id}/similar$API_URL_LAST")
    suspend fun getSimilarTvShow(
        @Path("tv_id") tvId: String
    ): TvShowListResponse
}