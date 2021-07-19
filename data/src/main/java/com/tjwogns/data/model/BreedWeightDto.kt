package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.BreedWeight

data class BreedWeightDto(
    @SerializedName("imperial")
    private val _imperial: String?,

    @SerializedName("metric")
    private val _metric: String?
): BreedWeight{
    override val imperial
        = _imperial ?: ""

    override val metric
        = _metric ?: ""

    companion object {
        val UNKNOWN: BreedWeight = BreedWeightDto(null, null)
    }
}
