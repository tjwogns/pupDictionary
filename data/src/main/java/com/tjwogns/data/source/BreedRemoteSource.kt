package com.tjwogns.data.source

import com.tjwogns.data.api.BreedApi
import com.tjwogns.data.model.BreedDto
import javax.inject.Inject

interface BreedRemoteSource {
    suspend fun getBreads(): List<BreedDto>
}

class BreedRemoteSourceImpl @Inject constructor(
    private val breedApi: BreedApi
): BreedRemoteSource {

    override suspend fun getBreads(): List<BreedDto> {
        return breedApi.getBreeds()
    }
}