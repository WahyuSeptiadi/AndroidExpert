package com.codeart.filmskuy.core.data.source.remote.network

/**
 * Created by wahyu_septiadi on 08, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

sealed class ApiResponse<out R> {
    data class Success<out T>(val data: T) : ApiResponse<T>()
    data class Error(val errorMessage: String) : ApiResponse<Nothing>()
    object Empty : ApiResponse<Nothing>()
}