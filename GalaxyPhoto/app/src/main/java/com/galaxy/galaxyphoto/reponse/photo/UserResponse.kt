package com.galaxy.galaxyphoto.reponse.photo

import com.galaxy.galaxyphoto.model.photo.UserModel
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("accepted_tos")
    val acceptedTos: Boolean,
    @SerializedName("bio")
    val bio: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("for_hire")
    val forHire: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("instagram_username")
    val instagramUsername: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("portfolio_url")
    val portfolioUrl: String,
    @SerializedName("total_collections")
    val totalCollections: Int,
    @SerializedName("total_likes")
    val totalLikes: Int,
    @SerializedName("total_photos")
    val totalPhotos: Int,
    @SerializedName("twitter_username")
    val twitterUsername: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("username")
    val username: String
) {
    fun convertToModel() = UserModel(
        acceptedTos = this.acceptedTos,
        bio = this.bio,
        firstName = this.firstName,
        forHire = this.forHire,
        id = this.id,
        instagramUsername = this.instagramUsername,
        location = this.location,
        name = this.name,
        portfolioUrl = this.portfolioUrl,
        totalCollections = this.totalCollections,
        totalLikes = this.totalLikes,
        totalPhotos = this.totalPhotos,
        twitterUsername = this.twitterUsername,
        updatedAt = this.updatedAt,
        username = this.username,
        )
}