package com.tjwogns.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tjwogns.data.db.converter.BreedConverter
import com.tjwogns.data.entity.BreedEntity

@Database(entities = [BreedEntity::class], version = 1)
@TypeConverters(BreedConverter::class)
abstract class PupDatabase: RoomDatabase() {
    abstract fun breedDao() : BreedDao
}