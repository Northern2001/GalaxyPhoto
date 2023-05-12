package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.domain.Costan
import com.galaxy.galaxyphoto.model.photo.PhotoModel

class HomeViewModel(
    private val homeRepository: HomeRepository
) : BaseViewModel() {
    fun getListPhoto(
        context: Context,
        onError: (String) -> Unit,
        onFinish: (List<PhotoModel>) -> Unit
        ) {
        homeRepository.getPhotoList().subscribeToResource(
            context, onError = {
                onError(it.toString())
            }
        ) {
            onFinish(it.data())
        }
    }
    fun getPhotoFollowTags(
        tags: String,
        context: Context,
        onError: (String) -> Unit,
        onFinish: (ImageModel) -> Unit
        ) {
        homeRepository.getPhotoFollowTags(tags).subscribeToResource(
            context, onError = {
                onError(it.toString())
            }
        ) {
            onFinish(it.data())
        }
    }

}