package com.tjwogns.data.source

import androidx.paging.PageKeyedDataSource
import com.tjwogns.data.api.BreedApi
import com.tjwogns.domain.model.Breed
import javax.inject.Inject

class BreedPagingSource@Inject constructor(
    private val breedApi: BreedApi
): PageKeyedDataSource<Int, Breed>() {

    private var page = 0

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Breed>
    ) {
        val result = breedApi.getBreeds(page, params.requestedLoadSize)

        callback.onResult(result, page, params.requestedLoadSize)

        page += 1
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Breed>) {
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Breed>) {
        val result = breedApi.getBreeds(page, params.requestedLoadSize)

        val nextPageKey = if (result.size != params.requestedLoadSize) null else params.requestedLoadSize
        callback.onResult(result, nextPageKey)

        page += 1
    }
}