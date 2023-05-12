package com.galaxy.galaxyphoto.reponse.photo

import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.photo.UrlsModel
import com.galaxy.galaxyphoto.model.photo.UserModel
import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("alt_description")
    val altDescription: String,
    @SerializedName("blur_hash")
    val blurHash: String,
    @SerializedName("color")
    val color: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("urls")
    val urls: UrlsModel,
    @SerializedName("user")
    val user: UserModel,
    @SerializedName("width")
    val width: Int
){
    fun convertToModel() = PhotoModel(
        altDescription = this.altDescription,
        blurHash = this.blurHash,
        color = this.color,
        createdAt = this.createdAt,
        description = this.description,
        height = this.height,
        id = this.id,
        likedByUser = this.likedByUser,
        likes = this.likes,
        slug = this.slug,
        updatedAt = this.updatedAt,
        urls = this.urls,
        user = this.user,
        width = this.width,
    )

}