package com.tjwogns.data.implementation

import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.BreedRepository
import javax.inject.Inject

class BreedRepositoryImpl @Inject constructor(
    private val breedRemoteSource: BreedRemoteSource
): BreedRepository{

    override suspend fun getBreeds(): List<Breed> {
        return breedRemoteSource.getBreads()
    }
}