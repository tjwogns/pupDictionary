package com.tjwogns.data.implementation

import androidx.paging.DataSource
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.source.BreedRemoteSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.Paging2BreedRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class Paging2BreedRepositoryImpl @Inject constructor(
    private val database: PupDatabase,
    private val breedRemoteSource: BreedRemoteSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
): Paging2BreedRepository {
    override fun getPaging2Breeds(isRefresh: Boolean): DataSource.Factory<Int, Breed> {

        val factory = database.breedDao().getDataSourceFactory()

        // PageBoundaryCallback
        if (isRefresh) {



        } else {

        }


        return database.breedDao().getDataSourceFactory().map { it as Breed }
    }
}