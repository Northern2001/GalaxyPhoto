package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.AuthRepository
import com.galaxy.galaxyphoto.domain.repository.CollectionRepository
import com.galaxy.galaxyphoto.domain.service.AuthService
import com.galaxy.galaxyphoto.domain.service.CollectionService
import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import com.galaxy.galaxyphoto.reponse.auth.AuthModel
import io.reactivex.rxjava3.core.Single

class AuthRepositoryImpl(
    private val context: Context,
    private val authService: AuthService
) : AuthRepository {

    override fun getAccessToken(): Single<Boolean> {
        return context.rxWithNetworkCheck {
            authService.getAccessToken()
        }.map {
            true
        }
    }

    override fun createAccessToken(): Single<AuthModel> {
        return context.rxWithNetworkCheck {
            authService.createAccessToken()
        }.map {
            it.convertToModel()
        }
    }

}