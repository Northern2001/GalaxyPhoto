package com.galaxy.galaxyphoto.reponse

import com.galaxy.galaxyphoto.model.ImageModel
import com.google.gson.annotations.SerializedName

data class ImageResponse(
    @SerializedName("hits")
    val hits: List<HitResponse>,
    @SerializedName("total")
    val total: Int,
    @SerializedName("totalHits")
    val totalHits: Int
){
    fun convertToModel() = ImageModel(
        hits = hits.map { it.convertToModel() },
        total = this.total,
        totalHits = this.totalHits
    )
}