package com.example.domain.repository

import com.example.domain.model.Breeds

interface BreedRepository {

    fun getBreeds(): List<Breeds>
}