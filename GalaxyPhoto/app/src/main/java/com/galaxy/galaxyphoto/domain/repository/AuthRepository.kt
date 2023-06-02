package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.reponse.auth.AuthModel
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable
import retrofit2.Response

interface AuthRepository {

    fun getAccessToken(): Disposable

    fun createAccessToken(): Single<AuthModel>

}