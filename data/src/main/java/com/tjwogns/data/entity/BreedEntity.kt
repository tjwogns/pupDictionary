package com.tjwogns.data.entity

import androidx.room.*
import com.tjwogns.data.model.BreedHeightAndWeightDto
import com.tjwogns.data.model.BreedImageDto
import com.tjwogns.domain.model.BreedHeightAndWeight
import com.tjwogns.domain.model.BreedImage

@Entity(tableName = "breeds")
data class BreedEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Long = 0L,

    @ColumnInfo(name = "name")
    var name: String = "",

    @ColumnInfo(name = "origin")
    var origin: String = "",

    @ColumnInfo(name = "life_span")
    var lifeSpan: String = "",

    @ColumnInfo(name = "bred_for")
    var bredFor: String = "",

    @ColumnInfo(name = "bred_group")
    var bredGroup: String = "",

    @ColumnInfo(name = "height")
    var height: BreedHeightAndWeight = BreedHeightAndWeightDto.UNKNOWN,

    @ColumnInfo(name = "weight")
    var weight: BreedHeightAndWeight = BreedHeightAndWeightDto.UNKNOWN,

    @ColumnInfo(name = "temperament")
    var temperament: String = "",

    @ColumnInfo(name = "image")
    var image: BreedImage = BreedImageDto.UNKNOWN,

    @ColumnInfo(name = "alt_names")
    var altNames: String = "",

    @ColumnInfo(name = "wikipedia_url")
    var wikipediaUrl: String = "",

    @ColumnInfo(name = "country_code")
    var countryCode: String = "",

    @ColumnInfo(name = "description")
    var description: String = ""
) {
    constructor() : this(
        0L,
        "",
        "",
        "",
        "",
        "",
        BreedHeightAndWeightDto.UNKNOWN,
        BreedHeightAndWeightDto.UNKNOWN,
        "",
        BreedImageDto.UNKNOWN,
        "",
        "",
        "",
        ""
    )
}
