package com.galaxy.galaxyphoto.model.photo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UrlsModel(
    val full: String = "",
    val raw: String = "",
    val regular: String = "",
    val small: String = "",
    val smallS3: String = "",
    val thumb: String = "",
    val url: String = ""
) : Parcelable