package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.reponse.ImageReponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeService {
    @GET("api/")
    fun getPhoto(
        @Query("key") key: String,
        @Query("image_type") type: String
    ): Single<ImageReponse>

}