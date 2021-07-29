package com.tjwogns.data.api

import com.tjwogns.data.model.BreedDto
import retrofit2.http.GET
import retrofit2.http.Query

interface BreedApi {

    /* List the Breeds */
    @GET(LIST_THE_BREEDS)
    suspend fun getBreeds(): List<BreedDto>

    /* List the Breeds For Paging2 */
    @GET(LIST_THE_BREEDS)
    fun getBreeds(
        @Query(PAGE) page: Int,
        @Query(LIMIT) limit: Int
    ): List<BreedDto>

    companion object {
        const val LIST_THE_BREEDS = "/v1/breeds"
        const val PAGE = "page"
        const val LIMIT = "limit"
    }
}