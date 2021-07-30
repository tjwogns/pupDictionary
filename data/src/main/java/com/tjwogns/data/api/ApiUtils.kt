package com.tjwogns.data.api

import com.google.gson.Gson
import com.tjwogns.domain.model.ResultWrapper
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException


suspend fun <T> safeApiCall(dispatcher: CoroutineDispatcher, apiCall: suspend () -> T): ResultWrapper<T> {
    return withContext(dispatcher) {
        try {
            ResultWrapper.Success(apiCall.invoke())
        } catch (throwable: Throwable) {
            when (throwable) {
                is IOException -> ResultWrapper.NetworkError
                is HttpException -> {
                    val errorResponse = convertErrorBody(throwable)
                    ResultWrapper.Error(errorResponse?.errorCode, errorResponse?.errorMessage)
                }
                else -> {
                    ResultWrapper.Error(null, null)
                }
            }
        }
    }
}

private fun convertErrorBody(throwable: HttpException): ErrorResponse? {
    return try {
        val errorBody = throwable.response()?.errorBody()!!

        Gson().fromJson(errorBody.toString(), ErrorResponse::class.java)

    } catch (exception: Exception) {
        null
    }
}

