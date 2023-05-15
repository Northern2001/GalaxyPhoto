package com.galaxy.galaxyphoto.model.photo

import android.os.Parcelable
import com.galaxy.galaxyphoto.model.user.UserModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class PhotoModel(
    val altDescription: String = "",
    val blurHash: String = "",
    val color: String = "",
    val createdAt: String = "",
    val height: Int = 0,
    val id: String = "",
    val likedByUser: Boolean = false,
    val likes: Int = 0,
    val slug: String = "",
    val updatedAt: String = "",
    val urls: UrlsModel = UrlsModel(),
    val user: UserModel = UserModel(),
    val width: Int = 0
) : Parcelable