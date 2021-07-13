package com.tjwogns.data.source

import com.tjwogns.domain.model.Breed

interface BreedRemoteSource {
    suspend fun getBreads(): List<Breed>
}