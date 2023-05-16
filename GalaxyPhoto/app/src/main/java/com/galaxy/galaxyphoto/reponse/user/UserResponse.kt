package com.galaxy.galaxyphoto.reponse.user

import com.galaxy.galaxyphoto.model.user.ProfileImageModel
import com.galaxy.galaxyphoto.model.user.SocialModel
import com.galaxy.galaxyphoto.model.user.UserModel
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("accepted_tos")
    val acceptedTos: Boolean? = null,
    @SerializedName("bio")
    val bio: String? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("for_hire")
    val forHire: Boolean? = null,
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("instagram_username")
    val instagramUsername: String? = null,
    @SerializedName("location")
    val location: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("portfolio_url")
    val portfolioUrl: String? = null,
    @SerializedName("total_collections")
    val totalCollections: Int? = null,
    @SerializedName("total_likes")
    val totalLikes: Int? = null,
    @SerializedName("total_photos")
    val totalPhotos: Int? = null,
    @SerializedName("twitter_username")
    val twitterUsername: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("username")
    val username: String? = null,
    @SerializedName("profile_image")
    val profileImage: ProfileImageResponse? = null,
    @SerializedName("social")
    val social: SocialResponse? = null,
) {
    fun convertToModel() = UserModel(
        acceptedTos = this.acceptedTos ?: false,
        bio = this.bio ?: "",
        firstName = this.firstName ?: "",
        forHire = this.forHire ?: false,
        id = this.id ?: "",
        instagramUsername = this.instagramUsername ?: "",
        location = this.location ?: "",
        name = this.name ?: "",
        portfolioUrl = this.portfolioUrl ?: "",
        totalCollections = this.totalCollections ?: 0,
        totalLikes = this.totalLikes ?: 0,
        totalPhotos = this.totalPhotos ?: 0,
        twitterUsername = this.twitterUsername ?: "",
        updatedAt = this.updatedAt ?: "",
        username = this.username ?: "",
        profileImage = this.profileImage?.convertToModel() ?: ProfileImageModel(),
        social = this.social?.convertToModel() ?: SocialModel()
    )
}

data class SocialResponse(
    @SerializedName("instagramUsername")
    val instagram: String? = null,
    @SerializedName("portfolio_url")
    val portfolio: String? = null,
    @SerializedName("twitter_username")
    val twitter: String? = null,
    @SerializedName("paypal_email")
    val mail: String? = null,
) {
    fun convertToModel() = SocialModel(
        instagram = this.instagram ?: "",
        portfolio = this.portfolio ?: "",
        twitter = this.twitter ?: "",
        email = this.mail ?: "",
    )

}