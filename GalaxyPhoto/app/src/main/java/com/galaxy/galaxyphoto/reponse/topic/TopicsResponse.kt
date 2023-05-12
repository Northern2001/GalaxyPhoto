package com.galaxy.galaxyphoto.reponse.topic

import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.google.gson.annotations.SerializedName

data class TopicsResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("title")
    val title: String
) {
    fun convertToModel() = TopicsModel(
        id = this.id,
        description = this.description,
        slug = this.slug,
        title = this.title
    )
}