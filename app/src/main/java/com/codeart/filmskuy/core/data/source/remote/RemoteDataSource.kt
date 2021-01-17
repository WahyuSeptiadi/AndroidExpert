package com.codeart.filmskuy.core.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.codeart.filmskuy.core.data.source.remote.network.ApiResponse
import com.codeart.filmskuy.core.data.source.remote.network.ApiService
import com.codeart.filmskuy.core.data.source.remote.response.MovieListResponse
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowListResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by wahyu_septiadi on 08, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class RemoteDataSource private constructor(private val apiService: ApiService) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(service: ApiService): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(service)
            }
    }

    fun getAllMovie(): LiveData<ApiResponse<List<MovieResultResponse>>> {
        val resultData = MutableLiveData<ApiResponse<List<MovieResultResponse>>>()

        val client = apiService.getMovies()

        client.enqueue(object : Callback<MovieListResponse> {
            override fun onResponse(
                call: Call<MovieListResponse>,
                responseMovie: Response<MovieListResponse>
            ) {
                val dataArray = responseMovie.body()?.movieResultRespons
                resultData.value = if (dataArray != null) ApiResponse.Success(dataArray) else ApiResponse.Empty
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                resultData.value = ApiResponse.Error(t.message.toString())
                Log.e("RemoteDataSource", t.message.toString())
            }
        })

        return resultData
    }

    fun getAllTvShow(): LiveData<ApiResponse<List<TvShowResultResponse>>> {
        val resultData = MutableLiveData<ApiResponse<List<TvShowResultResponse>>>()

        val client = apiService.getTvShows()

        client.enqueue(object : Callback<TvShowListResponse> {
            override fun onResponse(
                call: Call<TvShowListResponse>,
                responseTvShow: Response<TvShowListResponse>
            ) {
                val dataArray = responseTvShow.body()?.tvShowResultRespons
                resultData.value = if (dataArray != null) ApiResponse.Success(dataArray) else ApiResponse.Empty
            }

            override fun onFailure(call: Call<TvShowListResponse>, t: Throwable) {
                resultData.value = ApiResponse.Error(t.message.toString())
                Log.e("RemoteDataSource", t.message.toString())
            }
        })

        return resultData
    }
}