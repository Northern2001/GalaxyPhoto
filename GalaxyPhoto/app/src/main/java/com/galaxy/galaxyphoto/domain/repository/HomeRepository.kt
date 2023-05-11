package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.ImageModel
import io.reactivex.rxjava3.core.Single

interface HomeRepository {
    fun getPhotoList(
        key: String,
        type: String
    ): Single<ImageModel>
}