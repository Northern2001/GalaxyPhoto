package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.reponse.photo.PhotoModelData
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeRepository {

    fun getPhotoList(
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>>

    fun getPhotoDetail(
        photoId: String
    ): Single<PhotoModel>

    fun getTopics(
        page: Int,
        perPage: Int
    ): Single<List<TopicsModel>>

    fun getPhotoWithTopic(
        slug: String,
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>>

    fun searchPhotos(
        query: String,
        page: Int,
        perPage: Int
    ): Single<PhotoModelData>

    fun getCollections(
        useName: String,
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>>

}