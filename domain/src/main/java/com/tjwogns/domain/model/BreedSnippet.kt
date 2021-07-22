package com.tjwogns.domain.model

class BreedSnippet(val breed: Breed) {
    var viewType = BreedViewType.NORMAL

    fun changeViewType() {
        viewType = if (viewType == BreedViewType.NORMAL) BreedViewType.DETAIL
            else BreedViewType.NORMAL
    }

}