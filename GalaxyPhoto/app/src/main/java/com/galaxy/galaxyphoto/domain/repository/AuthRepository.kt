package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.reponse.auth.AuthModel
import io.reactivex.rxjava3.core.Single

interface AuthRepository {

    fun getAccessToken(): Single<Boolean>

    fun createAccessToken(): Single<AuthModel>

}