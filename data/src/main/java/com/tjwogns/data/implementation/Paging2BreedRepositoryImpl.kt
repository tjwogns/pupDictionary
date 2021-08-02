package com.tjwogns.data.implementation

import androidx.paging.DataSource
import com.tjwogns.data.api.safeApiCall
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.entity.BreedEntity
import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.ResultWrapper
import com.tjwogns.domain.repository.BreedRepository
import com.tjwogns.domain.repository.Paging2BreedRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class Paging2BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val breedRemoteSource: BreedRemoteSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
): Paging2BreedRepository {
    override fun getPaging2Breeds(): DataSource.Factory<Int, Breed> {

        return database.breedDao().getBreeds().map { it as Breed }
    }
}