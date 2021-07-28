package com.tjwogns.data.db.converter

import com.tjwogns.domain.model.BreedHeightAndWeight

object HeightAndWeightConverter {

    fun toHeightAndWeight(value: String)
        = ConverterUtils.toListModel(value, BreedHeightAndWeight::class.java)

    fun fromHeightAndWeight(value: BreedHeightAndWeight)
        = ConverterUtils.toJsonString(value)
}