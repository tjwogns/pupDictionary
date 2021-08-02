package com.tjwogns.domain.repository

import com.tjwogns.domain.model.ResultWrapper
import com.tjwogns.domain.model.Breed


interface BreedRepository {
    suspend fun getBreeds(): ResultWrapper<List<Breed>>
}