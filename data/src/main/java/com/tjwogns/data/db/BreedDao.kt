package com.tjwogns.data.db

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tjwogns.data.entity.BreedEntity

@Dao
interface BreedDao {
    @Query("SELECT * from breeds")
    fun getDataSourceFactory(): DataSource.Factory<Int, BreedEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: List<BreedEntity>): List<Long>

    @Query("DELETE FROM breeds")
    fun delete(): Int
}