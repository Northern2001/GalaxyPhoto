package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.reponse.photo.PhotoModelData

class HomeViewModel(
    private val homeRepository: HomeRepository
) : BaseViewModel() {
    var listPhoto by mutableStateOf(listOf<PhotoModel>())
    var listTopics by mutableStateOf(listOf<TopicsModel>())
    var photoModel by mutableStateOf(PhotoModel())
    var topicModel by mutableStateOf(TopicsModel())

    fun reloadListPhoto() {
        val dummy = listPhoto
        listPhoto = arrayListOf()
        listPhoto = dummy
    }

    fun reloadListTopic() {
        val dummy = listTopics
        listTopics = arrayListOf()
        listTopics = dummy
    }

    fun getListPhoto(
        context: Context,
        page: Int = 1,
        perPage: Int = 10,
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

    fun getPhotoDetail(
        context: Context,
        photoId: String,
        onFinish: (PhotoModel) -> Unit
    ) {
        homeRepository.getPhotoDetail(photoId).subscribeToResource(
            context,
        ) {
            onFinish(it.data())
        }
    }

    fun getTopics(
        context: Context,
        page: Int = 1,
        perPage: Int = 10,
        onFinish: (List<TopicsModel>) -> Unit
    ) {
        homeRepository.getTopics(page = page, perPage = perPage)
            .subscribeToResource(
                context, onError = {
                }
            ) {
                onFinish(it.data())
            }
    }

    fun getPhotoWithTopic(
        context: Context,
        slug: String = "",
        page: Int = 1,
        perPage: Int = 10,
        onFinish: (List<PhotoModel>) -> Unit
    ) {
        homeRepository.getPhotoWithTopic(slug = slug, page = page, perPage = perPage)
            .subscribeToResource(context, onError = {}
            ) {
                onFinish(it.data())
            }
    }

    fun searchPhotos(
        context: Context,
        query: String = "",
        page: Int = 1,
        perPage: Int = 10,
        onFinish: (PhotoModelData) -> Unit
    ) {
        homeRepository.searchPhotos(query = query, page = page, perPage = perPage)
            .subscribeToResource(context, onError = {}
            ) {
                onFinish(it.data())
            }
    }

    fun getCollections(
        context: Context,
        useName: String = "",
        page: Int = 1,
        perPage: Int = 10,
        onFinish: (List<PhotoModel>) -> Unit,
    ) {
        homeRepository.getCollections(useName = useName, page = page, perPage = perPage)
            .subscribeToResource(context, onError = {}
            ) {
                onFinish(it.data())
            }
    }


}