package com.tjwogns.data.model

import com.google.gson.annotations.SerializedName
import com.tjwogns.domain.model.BreedImage
import com.tjwogns.domain.model.BreedWeight

data class BreedImageDto(
    @SerializedName("height")
    private val _height: Long?,

    @SerializedName("width")
    private val _width: Long?,

    @SerializedName("id")
    private val _imageId: String?,

    @SerializedName("url")
    private val _imageUrl: String?
): BreedImage {
    override val height: Long
        get() = _height ?: 0L
    override val width: Long
        get() = _width ?: 0L
    override val imageId: String
        get() = _imageId ?: ""
    override val imageUrl: String
        get() =  _imageUrl ?: ""

    companion object {
        val UNKNOWN: BreedImage = BreedImageDto(null, null, null, null)
    }
}
