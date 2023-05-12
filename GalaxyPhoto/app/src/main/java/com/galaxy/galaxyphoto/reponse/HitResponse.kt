package com.galaxy.galaxyphoto.reponse

import com.galaxy.galaxyphoto.model.HitModel
import com.google.gson.annotations.SerializedName

data class HitResponse(
    @SerializedName("collections")
    val collections: Int,
    @SerializedName("comments")
    val comments: Int,
    @SerializedName("downloads")
    val downloads: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageHeight")
    val imageHeight: Int,
    @SerializedName("imageSize")
    val imageSize: Int,
    @SerializedName("imageWidth")
    val imageWidth: Int,
    @SerializedName("largeImageURL")
    val largeImageURL: String,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("pageURL")
    val pageURL: String,
    @SerializedName("previewHeight")
    val previewHeight: Int,
    @SerializedName("previewURL")
    val previewURL: String,
    @SerializedName("previewWidth")
    val previewWidth: Int,
    @SerializedName("tags")
    val tags: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("user")
    val user: String,
    @SerializedName("userImageURL")
    val userImageURL: String,
    @SerializedName("user_id")
    val userId: Int,
    @SerializedName("views")
    val views: Int,
    @SerializedName("webformatHeight")
    val webFormatHeight: Int,
    @SerializedName("webformatURL")
    val webFormatURL: String,
    @SerializedName("webformatWidth")
    val webFormatWidth: Int

) {
    fun convertToModel() = HitModel(
        collections = this.collections,
        comments = this.comments,
        downloads = this.downloads,
        id = this.id,
        imageHeight = this.imageHeight,
        imageSize = this.imageSize,
        imageWidth = this.imageWidth,
        largeImageURL = this.largeImageURL,
        likes = this.likes,
        pageURL = this.pageURL,
        previewHeight = this.previewHeight,
        previewURL = this.previewURL,
        previewWidth = this.previewWidth,
        tags = this.tags,
        type = this.type,
        user = this.user,
        userImageURL = this.userImageURL,
        userId = this.userId,
        views = this.views,
        webFormatHeight = this.webFormatHeight,
        webFormatURL = this.webFormatURL,
        webFormatWidth = this.webFormatWidth,
    )
}