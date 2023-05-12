package com.galaxy.galaxyphoto.reponse.photo

import com.galaxy.galaxyphoto.model.photo.UrlsModel
import com.google.gson.annotations.SerializedName

data class UrlsResponse(
    @SerializedName("full")
    val full: String,
    @SerializedName("raw")
    val raw: String,
    @SerializedName("regular")
    val regular: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("small_s3")
    val smallS3: String,
    @SerializedName("thumb")
    val thumb: String
) {
    fun convertToModel() = UrlsModel(
         full = this.full,
        raw = this.raw,
        regular = this.regular,
        small = this.small,
        smallS3 = this.smallS3,
        thumb = this.thumb,
    )
}