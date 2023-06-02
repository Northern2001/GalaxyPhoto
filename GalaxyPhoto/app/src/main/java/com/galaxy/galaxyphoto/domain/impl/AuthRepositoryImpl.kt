package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.AuthRepository
import com.galaxy.galaxyphoto.domain.service.AuthService
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import com.galaxy.galaxyphoto.reponse.auth.AuthModel
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class AuthRepositoryImpl(
    private val context: Context,
    private val authService: AuthService
) : AuthRepository {

    override fun getAccessToken(): Disposable {
      return  authService.getAccessToken().subscribeOn(Schedulers.io())
            .subscribe({
                val headers = it.headers().get("location") // do something with headers
                val data = it.body()
            }, {})

    }

    override fun createAccessToken(): Single<AuthModel> {
        return context.rxWithNetworkCheck {
            authService.createAccessToken()
        }.map {
            it.convertToModel()
        }
    }

}