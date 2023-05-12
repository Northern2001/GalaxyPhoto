package com.galaxy.galaxyphoto.model.topic

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopicsModel(
    val id: String = "",
    val description: String = "",
    val slug: String = "",
    val title: String = "",
    var isSelected: Boolean = false,
) : Parcelable