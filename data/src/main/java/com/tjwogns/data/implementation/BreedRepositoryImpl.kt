package com.tjwogns.data.implementation

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.BreedRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val breedRemoteSource: BreedRemoteSource
): BreedRepository{

    override suspend fun getBreeds(): List<Breed> {
        return breedRemoteSource.getBreads()
    }

    override fun getPaging2Breeds(): DataSource.Factory<Int, Breed> {

        return database.breedDao().getBreeds()
    }

}