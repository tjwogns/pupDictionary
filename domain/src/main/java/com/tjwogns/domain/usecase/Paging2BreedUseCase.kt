package com.tjwogns.domain.usecase

import androidx.paging.DataSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.repository.BreedRepository
import com.tjwogns.domain.repository.Paging2BreedRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class Paging2BreedUseCase(
    private val breedRepository: Paging2BreedRepository
) {
    operator fun invoke(isRefresh: Boolean): DataSource.Factory<Int,Breed> {
        return breedRepository.getPaging2Breeds(isRefresh)
    }
}