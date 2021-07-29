package com.tjwogns.domain.repository

import androidx.paging.DataSource
import com.tjwogns.domain.model.Breed


interface BreedRepository {
    suspend fun getBreeds(): List<Breed>
    fun getPaging2Breeds(): DataSource.Factory<Int,Breed>
}