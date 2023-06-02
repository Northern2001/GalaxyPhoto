package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.domain.helpe.data
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.photo.UrlsModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.networks.subscribeToResource
import com.galaxy.galaxyphoto.reponse.photo.PhotoModelData

class HomeViewModel(
    private val homeRepository: HomeRepository
) : BaseViewModel() {
    var listPhoto by mutableStateOf(listOf<PhotoModel>())
    var listPhotoWithTopic by mutableStateOf(listOf<PhotoModel>())
    var listPhotoSearch by mutableStateOf(listOf<PhotoModel>())
    var listPhotoDetail by mutableStateOf(listOf<PhotoModel>())
    var photoModelDetail by mutableStateOf(PhotoModel())
    var listTopics by mutableStateOf(listOf<TopicsModel>())
    var topicModel by mutableStateOf(TopicsModel())
    var pageTopic by mutableStateOf(1)
    var pagePhoto by mutableStateOf(1)

    fun addFistTopic() {
        listTopics = listTopics.toMutableList().also {
            val model = TopicsModel(title = "For You", isSelected = true)
            it.add(0, model)
            reloadListTopic()
        }
    }

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
        isLoadMore: Boolean = false,
    ) {
        pagePhoto = if (isLoadMore) pagePhoto else 1
        homeRepository.getPhotoList(page = pagePhoto, perPage = 20).subscribeToResource(
            context,
        ) {
            listPhoto =
                if (isLoadMore) listPhoto.toMutableList().also { newData ->
                    newData.addAll(it.data())
                } else {
                    it.data()
                }
            reloadListPhoto()
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
        isLoadMore: Boolean = false,
    ) {
        pageTopic = if (isLoadMore) pageTopic else 1
        homeRepository.getTopics(page = pageTopic, perPage = 10)
            .subscribeToResource(context) {
                listTopics =
                    if (isLoadMore) listTopics.toMutableList().also { newData ->
                        newData.addAll(it.data())
                    } else {
                        it.data()
                    }
                if (isLoadMore.not()){
                    addFistTopic()
                }
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

    fun downLoadPhoto(
        context: Context,
        id: String,
        onFinish: (UrlsModel) -> Unit,
    ) {
        homeRepository.downLoadPhoto(id = id)
            .subscribeToResource(context, onError = {}
            ) {
                onFinish(it.data())
            }
    }


}