package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName

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
){
}