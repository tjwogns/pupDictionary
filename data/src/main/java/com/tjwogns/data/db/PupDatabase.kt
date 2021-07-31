package com.tjwogns.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tjwogns.data.entity.BreedEntity

@Database(entities = [BreedEntity::class], version = 1)
abstract class PupDatabase: RoomDatabase() {
    abstract fun breedDao() : BreedDao
}