package com.galaxy.galaxyphoto.reponse.photo

import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.photo.TagsModel
import com.galaxy.galaxyphoto.model.photo.UrlsModel
import com.galaxy.galaxyphoto.model.user.UserModel
import com.galaxy.galaxyphoto.reponse.user.UserResponse
import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("alt_description")
    val altDescription: String? = null,
    @SerializedName("blur_hash")
    val blurHash: String? = null,
    @SerializedName("color")
    val color: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean? = null,
    @SerializedName("likes")
    val likes: Int? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("urls")
    val urls: UrlsModel? = null,
    @SerializedName("user")
    val user: UserResponse? = null,
    @SerializedName("width")
    val width: Int? = null,
    @SerializedName("tags")
    val tags: List<TagsResponse>? = null
) {
    fun convertToModel() = PhotoModel(
        altDescription = this.altDescription ?: "",
        blurHash = this.blurHash ?: "",
        color = this.color ?: "",
        createdAt = this.createdAt ?: "",
        height = this.height ?: 0,
        id = this.id ?: "",
        likedByUser = this.likedByUser ?: false,
        likes = this.likes ?: 0,
        slug = this.slug ?: "",
        updatedAt = this.updatedAt ?: "",
        urls = this.urls ?: UrlsModel(),
        user = this.user?.convertToModel() ?: UserModel(),
        width = this.width ?: 0,
        tags = this.tags?.map { it.convertToModel() } ?: arrayListOf(),
    )
}

data class TagsResponse(
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("title")
    val title: String? = null,
) {
    fun convertToModel() = TagsModel(
        type = this.type ?: "",
        title = this.title ?: "",
    )
}