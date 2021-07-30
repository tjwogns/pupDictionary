package com.tjwogns.data.api

import com.google.gson.annotations.SerializedName

data class ErrorResponse(
    @SerializedName("errorCode")
    val errorCode: Int,

    @SerializedName("errorMessage")
    val errorMessage: String
)
