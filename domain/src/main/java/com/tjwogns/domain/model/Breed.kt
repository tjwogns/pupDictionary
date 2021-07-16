package com.tjwogns.domain.model

interface Breed {
    val id: Long

    val name: String

    val origin: String

    val lifeSpan: String

    val bredFor: String

    val bredGroup: String

    val height: BreedHeight

//    val weight: BreedWeight

    val temperament: String

    val image: BreedImage

    val altNames: String

    val wikipediaUrl: String

    val countryCode: String

    val description: String
}

