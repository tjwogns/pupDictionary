package com.tjwogns.data.entity

import androidx.room.*
import com.tjwogns.data.model.BreedHeightAndWeightDto
import com.tjwogns.data.model.BreedImageDto
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.BreedHeightAndWeight
import com.tjwogns.domain.model.BreedImage

@Entity(tableName = "breeds")
data class BreedEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    override var id: Long = 0L,

    @ColumnInfo(name = "name")
    override var name: String = "",

    @ColumnInfo(name = "origin")
    override var origin: String = "",

    @ColumnInfo(name = "life_span")
    override var lifeSpan: String = "",

    @ColumnInfo(name = "bred_for")
    override var bredFor: String = "",

    @ColumnInfo(name = "bred_group")
    override var bredGroup: String = "",

    @ColumnInfo(name = "height")
    override var height: BreedHeightAndWeight = BreedHeightAndWeightDto.UNKNOWN,

    @ColumnInfo(name = "weight")
    override var weight: BreedHeightAndWeight = BreedHeightAndWeightDto.UNKNOWN,

    @ColumnInfo(name = "temperament")
    override var temperament: String = "",

    @ColumnInfo(name = "image")
    override var image: BreedImage = BreedImageDto.UNKNOWN,

    @ColumnInfo(name = "alt_names")
    override var altNames: String = "",

    @ColumnInfo(name = "wikipedia_url")
    override var wikipediaUrl: String = "",

    @ColumnInfo(name = "country_code")
    override var countryCode: String = "",

    @ColumnInfo(name = "description")
    override var description: String = ""
): Breed
