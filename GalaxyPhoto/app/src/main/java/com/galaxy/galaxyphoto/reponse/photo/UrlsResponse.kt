package com.galaxy.galaxyphoto.reponse.photo

import com.galaxy.galaxyphoto.model.photo.UrlsModel
import com.google.gson.annotations.SerializedName

data class UrlsResponse(
    @SerializedName("full")
    val full: String? = null,
    @SerializedName("raw")
    val raw: String? = null,
    @SerializedName("regular")
    val regular: String? = null,
    @SerializedName("small")
    val small: String? = null,
    @SerializedName("small_s3")
    val smallS3: String? = null,
    @SerializedName("thumb")
    val thumb: String? = null,
    @SerializedName("url")
    val url: String? = null


) {
    fun convertToModel() = UrlsModel(
        full = this.full ?: "",
        raw = this.raw ?: "",
        regular = this.regular ?: "",
        small = this.small ?: "",
        smallS3 = this.smallS3 ?: "",
        thumb = this.thumb ?: "",
    )
}