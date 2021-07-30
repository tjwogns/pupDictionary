package com.tjwogns.domain.usecase

import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.model.ResultWrapper
import com.tjwogns.domain.model.ResultWrapper.*
import com.tjwogns.domain.repository.BreedRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class BreedUseCase(
    private val breedRepository: BreedRepository
) {
    operator fun invoke(
        scope: CoroutineScope,
        onResult: (ResultWrapper<List<Breed>>) -> Unit = {}
    ) {
        scope.launch(Dispatchers.Main) {
            onResult(breedRepository.getBreeds())
        }
    }
}