package com.tjwogns.domain.repository

import com.tjwogns.domain.model.Breed


interface BreedRepository {
    suspend fun getBreeds(): List<Breed>
}