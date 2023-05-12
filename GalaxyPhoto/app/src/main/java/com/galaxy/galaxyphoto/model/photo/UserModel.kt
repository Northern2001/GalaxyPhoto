package com.galaxy.galaxyphoto.model.photo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    val acceptedTos: Boolean = false,
    val bio: String = "",
    val firstName: String = "",
    val forHire: Boolean = false,
    val id: String = "",
    val instagramUsername: String = "",
    val location: String = "",
    val name: String = "",
    val portfolioUrl: String = "",
    val totalCollections: Int = 0,
    val totalLikes: Int = 0,
    val totalPhotos: Int = 0,
    val twitterUsername: String = "",
    val updatedAt: String = "",
    val username: String = ""
) : Parcelable