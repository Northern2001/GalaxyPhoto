package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import io.reactivex.rxjava3.core.Single

interface HomeRepository {

    fun getPhotoList(
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>>

    fun getTopics(
        page: Int,
        perPage: Int
    ): Single<List<TopicsModel>>

}