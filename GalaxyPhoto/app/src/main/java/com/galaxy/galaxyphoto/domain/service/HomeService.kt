package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.domain.Costan
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.reponse.ImageResponse
import com.galaxy.galaxyphoto.reponse.photo.PhotoResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeService {
    @GET("photos/")
    fun getPhoto(
        @Query("client_id") key: String = Costan.API_KEY,
    ): Single<List<PhotoResponse>>

    @GET("api/")
    fun getPhotoFollowTags(
        @Query("key") key: String = Costan.API_KEY,
        @Query("image_type") type: String = "photo",
        @Query("tags") tags: String
    ): Single<ImageResponse>

}