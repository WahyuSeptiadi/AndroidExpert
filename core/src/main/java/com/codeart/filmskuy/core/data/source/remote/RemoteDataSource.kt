package com.codeart.filmskuy.core.data.source.remote

import android.util.Log
import com.codeart.filmskuy.core.data.source.remote.network.ApiResponse
import com.codeart.filmskuy.core.data.source.remote.network.ApiService
import com.codeart.filmskuy.core.data.source.remote.response.MovieResultResponse
import com.codeart.filmskuy.core.data.source.remote.response.TvShowResultResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * Created by wahyu_septiadi on 08, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getAllMovie(): Flow<ApiResponse<List<MovieResultResponse>>> {
        return flow {
            try {
                val response = apiService.getMovies()
                val dataArray = response.movieResultResponse
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.movieResultResponse))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getAllTvShow(): Flow<ApiResponse<List<TvShowResultResponse>>> {
        return flow {
            try {
                val response = apiService.getTvShows()
                val dataArray = response.tvShowResultResponse
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.tvShowResultResponse))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getSearchMovie(title: String): Flow<ApiResponse<List<MovieResultResponse>>> {
        return flow {
            try {
                val response = apiService.searchMovie(title)
                val dataArray = response.movieResultResponse
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.movieResultResponse))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getSearchTvShow(name: String): Flow<ApiResponse<List<TvShowResultResponse>>> {
        return flow {
            try {
                val response = apiService.searchTvShow(name)
                val dataArray = response.tvShowResultResponse
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.tvShowResultResponse))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getSimilarMovie(id: String): Flow<ApiResponse<List<MovieResultResponse>>> {
        return flow {
            try {
                val response = apiService.getSimilarMovie(id)
                val dataArray = response.movieResultResponse

                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(dataArray))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    fun getSimilarTvShow(id: String): Flow<ApiResponse<List<TvShowResultResponse>>> {
        return flow {
            try {
                val response = apiService.getSimilarTvShow(id)
                val dataArray = response.tvShowResultResponse

                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(dataArray))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}