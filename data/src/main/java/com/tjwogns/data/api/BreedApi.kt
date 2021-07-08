package com.tjwogns.data.api

import com.tjwogns.data.model.BreedDto
import retrofit2.http.GET

interface BreedApi {

    /* List the Breeds */
    @GET(LIST_THE_BREEDS)
    suspend fun getBreeds(): List<BreedDto>

    companion object {
        const val LIST_THE_BREEDS = "/v1/breeds"
    }
}