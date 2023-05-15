package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.reponse.photo.PhotoResponse
import com.galaxy.galaxyphoto.reponse.topic.TopicsResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface HomeService {
    @GET("photos/")
    fun getPhoto(
        @Query("client_id") key: String = Contains.API_KEY,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<PhotoResponse>>

    @GET("topics/")
    fun getTopics(
        @Query("client_id") key: String = Contains.API_KEY,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<TopicsResponse>>

    @GET("topics/{id_or_slug}/photos")
    fun getPhotoWithTopic(
        @Path("id_or_slug") slug: String,
        @Query("client_id") key: String = Contains.API_KEY,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<PhotoResponse>>
}