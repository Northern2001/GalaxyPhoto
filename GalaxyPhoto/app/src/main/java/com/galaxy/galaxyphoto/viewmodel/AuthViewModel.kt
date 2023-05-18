package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.common.ProgressManager
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.AuthRepository
import com.galaxy.galaxyphoto.domain.repository.CollectionRepository
import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.reponse.auth.AuthModel

class AuthViewModel(
    private val authRepository: AuthRepository
) : BaseViewModel() {

    fun getAccessToken(
        context: Context
    ) {
        authRepository.getAccessToken().subscribeToResource(context, onError = {}) {}
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