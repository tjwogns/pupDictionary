package com.tjwogns.data.db

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query
import com.tjwogns.domain.model.Breed

@Dao
interface BreedDao {
    @Query("SELECT * from breeds")
    fun getBreeds(): DataSource.Factory<Int, Breed>
}