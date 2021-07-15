package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.BreedHeight

data class BreedHeightDto(
    @SerializedName("imperial")
    private val _imperial: String?,

    @SerializedName("metric")
    private val _metric: String?
): BreedHeight {
    override val imperial
        = _imperial ?: ""

    override val metric
        = _metric ?: ""

    companion object {
        val UNKNOWN: BreedHeight = BreedHeightDto(null, null)
    }
}
