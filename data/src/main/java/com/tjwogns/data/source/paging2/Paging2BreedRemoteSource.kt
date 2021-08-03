package com.tjwogns.data.source

import com.tjwogns.data.api.BreedApi
import com.tjwogns.data.model.BreedDto
import javax.inject.Inject

interface Paging2BreedRemoteSource {
    suspend fun getBreads(page: Int, limit: Int): List<BreedDto>
}

class Paging2BreedRemoteSourceImpl @Inject constructor(
    private val breedApi: BreedApi
): Paging2BreedRemoteSource {

    override suspend fun getBreads(page: Int, limit: Int): List<BreedDto> {
        return breedApi.getBreeds(page, limit)
    }
}