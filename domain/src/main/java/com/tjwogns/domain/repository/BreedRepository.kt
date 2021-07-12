package com.tjwogns.domain.repository

import com.tjwogns.domain.model.Breed

interface BreedRepository {
    fun getBreeds(): List<Breed>
}