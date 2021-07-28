package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.BreedHeightAndWeight

data class BreedHeightAndWeightDto(
    @SerializedName("imperial")
    private val _imperial: String?,

    @SerializedName("metric")
    private val _metric: String?
): BreedHeightAndWeight {
    override val imperial
        get() = _imperial ?: ""

    override val metric
        get() = _metric ?: ""

    companion object {
        val UNKNOWN: BreedHeightAndWeight = BreedHeightAndWeightDto(null, null)
    }
}
