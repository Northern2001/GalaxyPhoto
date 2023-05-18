package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.domain.Contains
import io.reactivex.rxjava3.core.Single
import retrofit2.http.POST
import retrofit2.http.Query

interface CollectionService {

    @POST("collections")
    fun createCollection(
        @Query("client_id") key: String = Contains.ACCESS_KEY,
        @Query("title") title: String,
        @Query("description") description: String,
        @Query("private") privacy: Boolean
    ): Single<Boolean>

}