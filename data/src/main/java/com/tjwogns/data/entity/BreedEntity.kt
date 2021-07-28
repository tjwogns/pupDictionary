package com.tjwogns.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "breeds")
data class BreedEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long

)
