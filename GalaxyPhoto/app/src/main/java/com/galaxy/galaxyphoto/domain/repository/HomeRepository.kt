package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import io.reactivex.rxjava3.core.Single

interface HomeRepository {
    fun getPhotoList(): Single<List<PhotoModel>>
    fun getPhotoFollowTags(tags : String): Single<ImageModel>
}