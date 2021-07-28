package com.tjwogns.data.source

import androidx.paging.PageKeyedDataSource
import com.tjwogns.data.api.BreedApi
import com.tjwogns.domain.model.Breed
import javax.inject.Inject

class BreedPagingSource@Inject constructor(
    private val breedApi: BreedApi
): PageKeyedDataSource<Int, Breed>() {
    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Breed>
    ) {
        TODO("Not yet implemented")
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Breed>) {
        TODO("Not yet implemented")
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Breed>) {
        TODO("Not yet implemented")
    }
}