package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.domain.Costan

class HomeViewModel(
    private val homeRepository: HomeRepository
) : BaseViewModel() {
    fun getListPhoto(
        context: Context,
        key: String = Costan.API_KEY,
        type: String = "",
        onError: (String) -> Unit,
        onFinish: (ImageModel) -> Unit
        ) {
        homeRepository.getPhotoList(key, type).subscribeToResource(
            context, onError = {
                onError(it.toString())
            }
        ) {
            onFinish(it.data())
        }
    }

}