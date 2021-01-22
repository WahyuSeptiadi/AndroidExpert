package com.codeart.filmskuy.core.data.source

import com.codeart.filmskuy.core.data.source.remote.network.ApiResponse
import kotlinx.coroutines.flow.*

/**
 * Created by wahyu_septiadi on 22, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

abstract class RemoteResource<ResultType, RequestType> {

    private var result: Flow<Resource<ResultType>> = flow {
        emit(Resource.Loading())
        when (val apiResponse = createCall().first()) {
            is ApiResponse.Success -> {
                val data = convertCallResult(apiResponse.data)
                emitAll(data.map { Resource.Success(it) })
            }
            is ApiResponse.Empty -> {
                val data = emptyResult()
                emitAll(data.map { Resource.Success(it) })
            }
            is ApiResponse.Error -> {
                emit(Resource.Error<ResultType>(apiResponse.errorMessage))
            }
        }
    }

    protected abstract fun createCall(): Flow<ApiResponse<RequestType>>

    protected abstract fun convertCallResult(data: RequestType): Flow<ResultType>

    protected abstract fun emptyResult(): Flow<ResultType>

    fun asFlow(): Flow<Resource<ResultType>> = result
}