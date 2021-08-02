package com.tjwogns.data.implementation

import androidx.paging.DataSource
import com.tjwogns.data.api.safeApiCall
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.entity.BreedEntity
import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.ResultWrapper
import com.tjwogns.domain.repository.BreedRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val breedRemoteSource: BreedRemoteSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
): BreedRepository{

    override suspend fun getBreeds(): ResultWrapper<List<Breed>> {
        return safeApiCall(dispatcher) {
            breedRemoteSource.getBreads()
        }
    }

//    override fun getPaging2Breeds(): DataSource.Factory<Int, BreedEntity> {
//
//        return database.breedDao().getBreeds()
//    }

}