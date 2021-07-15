package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.Breed
import com.tjwogns.domain.model.BreedHeight
import com.tjwogns.domain.model.BreedImage
import com.tjwogns.domain.model.BreedWeight

data class BreedDto (
    @SerializedName("id")
    private val _id: Long?,

    @SerializedName("name")
    private val _name: String?,

    @SerializedName("origin")
    private val _origin: String?,

    @SerializedName("life_span")
    private val _lifeSpan: String?,

    @SerializedName("bred_for")
    private val _bredFor: String?,

    @SerializedName("bred_group")
    private val _bredGroup: String?,

    @SerializedName("height")
    private val _height: BreedHeightDto?,

    @SerializedName("weight")
    private val _weight: BreedWeightDto?,

    @SerializedName("temperament")
    private val _temperament: String?,

    @SerializedName("image")
    private val _image: BreedImageDto?,

    @SerializedName("alt_names")
    private val _altNames: String?,

    @SerializedName("wikipedia_url")
    private val _wikipediaUrl: String?,

    @SerializedName("country_code")
    private val _countryCode: String?,

    @SerializedName("description")
    private val _description: String?

): Breed {
    override val id: Long
        get() = _id ?: -1L

    override val name: String
        get() = _name ?: ""

    override val origin: String
        get() = _origin ?: ""

    override val lifeSpan: String
        get() = _lifeSpan ?: ""

    override val bredFor: String
        get() = _bredFor ?: ""

    override val bredGroup: String
        get() = _bredGroup ?: ""

    override val height: BreedHeight
        get() = _height ?: BreedHeightDto.UNKNOWN

    override val weight: BreedWeight
        get() = _weight ?: BreedWeightDto.UNKNOWN

    override val temperament: String
        get() = _temperament ?: ""

    override val image: BreedImage
        get() = _image ?: BreedImageDto.UNKNOWN

    override val altNames: String
        get() = _altNames ?: ""

    override val wikipediaUrl: String
        get() = _wikipediaUrl ?: ""

    override val countryCode: String
        get() = _countryCode ?: ""

    override val description: String
        get() = _description ?: ""
}