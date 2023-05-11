package com.galaxy.galaxyphoto.reponse

import com.galaxy.galaxyphoto.model.ImageModel
import com.google.gson.annotations.SerializedName

data class ImageReponse(
    @SerializedName("hits")
    val hits: List<HitReponse>,
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