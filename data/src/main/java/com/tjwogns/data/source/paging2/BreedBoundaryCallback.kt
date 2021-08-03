package com.tjwogns.data.source.paging2

import androidx.paging.PagedList
import com.tjwogns.data.api.safeApiCall
import com.tjwogns.data.db.PupDatabase
import com.tjwogns.data.entity.BreedEntity
import com.tjwogns.data.model.BreedDto
import com.tjwogns.domain.model.ResultWrapper.*
import kotlinx.coroutines.*
import java.lang.Exception
import java.util.concurrent.Callable
import kotlin.Error

class BreedBoundaryCallback (
    private val database: PupDatabase,
    private val breedRemoteSource: Paging2BreedRemoteSource,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
): PagedList.BoundaryCallback<BreedEntity>() {

    private var queryOffset = Pair(0, 20)

    override fun onZeroItemsLoaded() {
        CoroutineScope(dispatcher).launch {
            fetchBreed()
        }
    }

    override fun onItemAtFrontLoaded(itemAtFront: BreedEntity) {
        CoroutineScope(dispatcher).launch {
            fetchBreed()
        }
    }

    override fun onItemAtEndLoaded(itemAtEnd: BreedEntity) {
        CoroutineScope(dispatcher).launch {
            fetchBreed()
        }
    }

    private suspend fun fetchBreed() {
        val call = safeApiCall(dispatcher) {
            breedRemoteSource.getBreads(queryOffset.first, queryOffset.second)
        }

        try {
            when (call) {
                is Success -> {
                    if (call.value.size > 0L) {
                        onSuccess(call.value)
                    } else {
                        throw Exception()
                    }
                }
                is Error -> {
                    throw Exception()
                }
                is NetworkError -> {
                    throw Exception()
                }
            }
        } catch (e: Exception) {
            e.stackTrace
        }
    }

    private fun onSuccess(results: List<BreedDto>, isRefresh: Boolean = false) {
        // DB INSERT
        val entities = results.map { BreedEntity().create(it)}
        var inserted: Int? = null
        try {
            inserted = database.runInTransaction(Callable {
                if (isRefresh) {
                    // delete
                    database.breedDao().delete()
                }

                if(entities.isNotEmpty()) {
                    database.breedDao().insert(entities)
                }

                entities.size
            })
        } catch (e: Exception) {
            e.stackTrace
        }

        // QUERY OFFSET NEXT
        queryOffset = Pair(queryOffset.first + 1, 20)

    }
}