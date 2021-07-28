package com.tjwogns.data.implementation

import androidx.paging.DataSource
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.BreedRepository
import javax.inject.Inject

class BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val breedRemoteSource: BreedRemoteSource
): BreedRepository{

    override suspend fun getBreeds(): List<Breed> {
        return breedRemoteSource.getBreads()
    }

    override suspend fun getPaging2Breeds(): DataSource.Factory<Int, Breed> {
        return database.breedDao().getBreeds()
    }
}