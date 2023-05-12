package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.domain.service.HomeService
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.model.topic.TopicsModel
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
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

}