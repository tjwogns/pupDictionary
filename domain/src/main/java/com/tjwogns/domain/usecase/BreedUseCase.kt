package com.tjwogns.domain.usecase

import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.repository.BreedRepository

class BreedUseCase(
    private val breedRepository: BreedRepository
) {
    fun getBreeds(): List<Breed> {
        return breedRepository.getBreeds()
    }
}