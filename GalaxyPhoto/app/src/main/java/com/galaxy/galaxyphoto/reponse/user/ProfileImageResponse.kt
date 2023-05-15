package com.galaxy.galaxyphoto.reponse.user

import com.galaxy.galaxyphoto.model.user.ProfileImageModel
import com.google.gson.annotations.SerializedName

data class ProfileImageResponse(
    @SerializedName("small")
    val small: String? = null,
    @SerializedName("medium")
    val medium: String? = null,
    @SerializedName("large")
    val large: String? = null
) {
    fun convertToModel() = ProfileImageModel(
        small = this.small ?: "",
        medium = this.medium ?: "",
        large = this.large ?: "",
    )
}