package com.tjwogns.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tjwogns.domain.model.BreedHeightAndWeight
import com.tjwogns.domain.model.BreedImage

@Entity(tableName = "breeds")
data class BreedEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    private val id: Long?,

    @ColumnInfo(name = "name")
    private val name: String?,

    @ColumnInfo(name = "origin")
    private val origin: String?,

    @ColumnInfo(name = "life_span")
    private val lifeSpan: String?,

    @ColumnInfo(name = "bred_for")
    private val bredFor: String?,

    @ColumnInfo(name = "bred_group")
    private val bredGroup: String?,

    @ColumnInfo(name = "height")
    private val height: BreedHeightAndWeight?,

    @ColumnInfo(name = "weight")
    private val weight: BreedHeightAndWeight?,

    @ColumnInfo(name = "temperament")
    private val temperament: String?,

    @ColumnInfo(name = "image")
    private val image: BreedImage?,

    @ColumnInfo(name = "alt_names")
    private val altNames: String?,

    @ColumnInfo(name = "wikipedia_url")
    private val wikipediaUrl: String?,

    @ColumnInfo(name = "country_code")
    private val countryCode: String?,

    @ColumnInfo(name = "description")
    private val description: String?
)
