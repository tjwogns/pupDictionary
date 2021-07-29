package com.tjwogns.domain.usecase

import androidx.paging.DataSource
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.repository.BreedRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class Paging2BreedUseCase(
    private val breedRepository: BreedRepository
) {
    operator fun invoke(): DataSource.Factory<Int,Breed> {
        return breedRepository.getPaging2Breeds()
    }
}