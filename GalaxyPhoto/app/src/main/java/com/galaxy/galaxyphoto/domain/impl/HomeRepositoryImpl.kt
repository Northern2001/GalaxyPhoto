package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.domain.service.HomeService
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import com.galaxy.galaxyphoto.reponse.photo.PhotoModelData
import io.reactivex.rxjava3.core.Single

class HomeRepositoryImpl(
    private val context: Context,
    private val homeService: HomeService
) : HomeRepository {
    override fun getPhotoList(page: Int, perPage: Int): Single<List<PhotoModel>> {
        return context.rxWithNetworkCheck {
            homeService.getPhoto(
                page = page,
                perPage = perPage

            )
        }.map {
            it.map { it.convertToModel() }
        }
    }

    override fun getPhotoDetail(photoId: String): Single<PhotoModel> {
        return context.rxWithNetworkCheck {
            homeService.getPhotoDetail(
                photoId = photoId
            )
        }.map {
            it.convertToModel()
        }
    }

    override fun getTopics(page: Int, perPage: Int): Single<List<TopicsModel>> {
        return context.rxWithNetworkCheck {
            homeService.getTopics(
                page = page,
                perPage = perPage
            )
        }.map {
            it.map { it.convertToModel() }
        }
    }

    override fun getPhotoWithTopic(
        slug: String,
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>> {
        return context.rxWithNetworkCheck {
            homeService.getPhotoWithTopic(
                slug = slug,
                page = page,
                perPage = perPage

            )
        }.map {
            it.map { it.convertToModel() }
        }
    }

    override fun searchPhotos(query: String, page: Int, perPage: Int): Single<PhotoModelData> {
        return context.rxWithNetworkCheck {
            homeService.searchPhotos(
                query = query,
                page = page,
                perPage = perPage

            )
        }.map {
            it.convertToModel()
        }
    }

    override fun getCollections(
        useName: String,
        page: Int,
        perPage: Int
    ): Single<List<PhotoModel>> {
        return context.rxWithNetworkCheck {
            homeService.getCollections(
                userName = useName,
                page = page,
                perPage = perPage
            )
        }.map {
            it.map { it.convertToModel() }
        }
    }

}