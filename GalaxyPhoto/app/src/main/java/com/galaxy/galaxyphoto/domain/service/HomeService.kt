package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.domain.Costan
import com.galaxy.galaxyphoto.reponse.photo.PhotoResponse
import com.galaxy.galaxyphoto.reponse.topic.TopicsResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeService {
    @GET("photos/")
    fun getPhoto(
        @Query("client_id") key: String = Costan.API_KEY,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<PhotoResponse>>

    @GET("topics/")
    fun getTopics(
        @Query("client_id") key: String = Costan.API_KEY,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<List<TopicsResponse>>
}