package com.tjwogns.domain.model

class BreedSnippet(val breed: Breed) {
    var viewType = BreedViewType.NORMAL

    fun changeViewType() =
        if (viewType == BreedViewType.NORMAL) BreedViewType.DETAIL
        else BreedViewType.NORMAL
}