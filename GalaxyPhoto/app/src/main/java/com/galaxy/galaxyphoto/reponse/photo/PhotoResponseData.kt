package com.galaxy.galaxyphoto.reponse.photo

import android.os.Parcelable
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class PhotoResponseData(
    @SerializedName("total")
    val total: Int? = null,
    @SerializedName("total_pages")
    val totalPages: Int? = null,
    @SerializedName("results")
    val results: List<PhotoResponse>? = null,
) {
    fun convertToModel()= PhotoModelData(
        total = this.total?:0,
        totalPages = this.totalPages?:0,
        results = this.results?.map { it.convertToModel() } ?: arrayListOf()

    )


}
@Parcelize
data class PhotoModelData(
    val total: Int = 0,
    val totalPages: Int = 0,
    val results: List<PhotoModel> = arrayListOf(),
) : Parcelable