package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.domain.service.HomeService
import io.reactivex.rxjava3.core.Single

class HomeRepositoryImpl(
    private val context: Context,
    private val homeService: HomeService
) : HomeRepository {
    override fun getPhotoList(key: String, type: String): Single<ImageModel> {
        return context.rxWithNetworkCheck {
            homeService.getPhoto(key, type)
        }.map {
            it.convertToModel()
        }
    }

}