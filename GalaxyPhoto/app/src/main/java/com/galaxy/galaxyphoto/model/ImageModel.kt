package com.galaxy.galaxyphoto.model

import android.os.Parcelable
import com.galaxy.galaxyphoto.model.HitModel
import kotlinx.parcelize.Parcelize

@Parcelize
data class ImageModel(
    val hits: List<HitModel> = arrayListOf(),
    val total: Int = 0,
    val totalHits: Int = 0,
) : Parcelable