package com.tjwogns.domain.model


sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T): ResultWrapper<T>()
    data class Error(val code: Int? = null, val errorMessage: String? = null): ResultWrapper<Nothing>()
    object NetworkError: ResultWrapper<Nothing>()
}
