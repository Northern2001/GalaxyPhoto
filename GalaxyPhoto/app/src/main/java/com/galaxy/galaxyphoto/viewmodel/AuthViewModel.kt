package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.AuthRepository
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.reponse.auth.AuthModel

class AuthViewModel(
    private val authRepository: AuthRepository
) : BaseViewModel() {

    fun getAccessToken(
        context: Context
    ) {
        authRepository.getAccessToken()
    }

    fun createAccessToken(
        context: Context,
        onFinish :(AuthModel) -> Unit
    ) {
        authRepository.createAccessToken().subscribeToResource(context, onError = {}) {
            onFinish(it.data())
        }
    }
}