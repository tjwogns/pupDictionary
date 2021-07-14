package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.Breed

data class BreedDto (
    @SerializedName("id")
    private val _id: String,

    @SerializedName("name")
    private val _name: String,

    @SerializedName("temperament")
    private val _temperament: String,

    @SerializedName("life_span")
    private val _lifeSpan: String,

    @SerializedName("alt_names")
    private val _altNames: String,

    @SerializedName("wikipedia_url")
    private val _wikipediaUrl: String,

    @SerializedName("origin")
    private val _origin: String,

    @SerializedName("weight")
    private val _weight: String,

    @SerializedName("country_code")
    private val _countryCode: String,

    @SerializedName("height")
    private val _height: String
): Breed {
    override val id: String
        get() = _id

    override val name: String
        get() = _name

    override val temperament: String
        get() = _temperament

    override val lifeSpan: String
        get() = _lifeSpan

    override val altNames: String
        get() = _altNames

    override val wikipediaUrl: String
        get() = _wikipediaUrl

    override val origin: String
        get() = _origin

    override val weight: String
        get() = _weight

    override val countryCode: String
        get() = _countryCode

    override val height: String
        get() = _height
}