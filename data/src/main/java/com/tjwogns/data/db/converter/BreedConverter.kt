package com.tjwogns.data.db.converter

import androidx.room.TypeConverter
import com.tjwogns.data.model.BreedHeightAndWeightDto
import com.tjwogns.data.model.BreedImageDto
import com.tjwogns.domain.model.BreedHeightAndWeight
import com.tjwogns.domain.model.BreedImage

object BreedConverter {

    ////////////////////////////////////
    //////  Breed HeightAndWeight Converter
    ////////////////////////////////////
    @JvmStatic
    @TypeConverter
    fun toHeightAndWeight(value: String): BreedHeightAndWeight
        = ConverterUtils.toModel(value, BreedHeightAndWeightDto::class.java)

    @JvmStatic
    @TypeConverter
    fun fromHeightAndWeight(value: BreedHeightAndWeight): String
        = ConverterUtils.toJsonString(value)


    ////////////////////////////////////
    //////  Breed Image Converter
    ////////////////////////////////////
    @JvmStatic
    @TypeConverter
    fun toImage(value: String): BreedImage
            = ConverterUtils.toModel(value, BreedImageDto::class.java)

    @JvmStatic
    @TypeConverter
    fun fromImage(value: BreedImage): String
            = ConverterUtils.toJsonString(value)
}