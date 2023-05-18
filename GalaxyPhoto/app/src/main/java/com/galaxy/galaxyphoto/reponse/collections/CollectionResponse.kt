package com.galaxy.galaxyphoto.reponse.collections

import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.model.collection.LinksModel
import com.galaxy.galaxyphoto.model.user.UserModel
import com.galaxy.galaxyphoto.reponse.user.UserResponse
import com.google.gson.annotations.SerializedName

data class CollectionResponse(
    @SerializedName("cover_photo")
    val coverPhoto: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("featured")
    val featured: Boolean? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("last_collected_at")
    val lastCollectedAt: String? = null,
    @SerializedName("links")
    val links: LinksResponse? = null,
    @SerializedName("private")
    val private: Boolean? = null,
    @SerializedName("published_at")
    val publishedAt: String? = null,
    @SerializedName("share_key")
    val shareKey: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("total_photos")
    val totalPhotos: Int? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("user")
    val user: UserResponse? = null
) {
    fun convertToModel() = CollectionModel(
        coverPhoto = this.coverPhoto ?: "",
        description = this.description ?: "",
        featured = this.featured ?: false,
        id = this.id ?: 0,
        lastCollectedAt = this.lastCollectedAt ?: "",
        links = this.links?.convertToModel()?: LinksModel(),
        private = this.private ?: false,
        publishedAt = this.publishedAt ?: "",
        shareKey = this.shareKey ?: "",
        title = this.title ?: "",
        totalPhotos = this.totalPhotos ?: 0,
        updatedAt = this.updatedAt ?: "",
        user = this.user?.convertToModel()?: UserModel(),
    )
}

data class LinksResponse(
    @SerializedName("html")
    val html: String? = null,
    @SerializedName("photos")
    val photos: String? = null,
    @SerializedName("self")
    val self: String? = null

) {
    fun convertToModel() = LinksModel(
        html = this.html ?: "",
        photos = this.photos ?: "",
        self = this.self ?: ""
    )
}