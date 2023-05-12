package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.networks.subscribeToResource

class HomeViewModel(
    private val homeRepository: HomeRepository
) : BaseViewModel() {

    fun getListPhoto(
        context: Context,
        page: Int = 1,
        perPage: Int = 4,
        onError: (String) -> Unit,
        onFinish: (List<PhotoModel>) -> Unit
    ) {
        homeRepository.getPhotoList(page = page, perPage = perPage).subscribeToResource(
            context, onError = {
                onError(it.toString())
            }
        ) {
            onFinish(it.data())
        }
    }

    fun getTopics(
        context: Context,
        page: Int = 1,
        perPage: Int = 4,
        onFinish: (List<TopicsModel>) -> Unit
    ) {
        homeRepository.getTopics(page = page, perPage = perPage).subscribeToResource(
            context, onError = {
            }
        ) {
            onFinish(it.data())
        }
    }


}