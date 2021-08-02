package com.tjwogns.data.source.paging2

import androidx.paging.PagedList
import com.tjwogns.data.entity.BreedEntity

class BreedBoundaryCallback(

): PagedList.BoundaryCallback<BreedEntity>() {
    override fun onZeroItemsLoaded() {
        super.onZeroItemsLoaded()
    }

    override fun onItemAtFrontLoaded(itemAtFront: BreedEntity) {
        super.onItemAtFrontLoaded(itemAtFront)
    }

    override fun onItemAtEndLoaded(itemAtEnd: BreedEntity) {
        super.onItemAtEndLoaded(itemAtEnd)
    }
}