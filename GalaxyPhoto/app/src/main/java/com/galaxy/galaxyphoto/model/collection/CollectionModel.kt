package com.galaxy.galaxyphoto.model.collection

import android.os.Parcelable
import com.galaxy.galaxyphoto.model.user.UserModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class CollectionModel(
    val coverPhoto: String = "",
    val description: String = "",
    val featured: Boolean = false,
    val id: Int = 0,
    val lastCollectedAt: String = "",
    val links: LinksModel = LinksModel(),
    val private: Boolean = false,
    val publishedAt: String = "",
    val shareKey: String = "",
    val title: String = "",
    val totalPhotos: Int = 0,
    val updatedAt: String = "",
    val user: UserModel = UserModel()

) : Parcelable



@Parcelize
data class LinksModel(
    val html: String = "",
    val photos: String = "",
    val self: String = ""
) : Parcelable
