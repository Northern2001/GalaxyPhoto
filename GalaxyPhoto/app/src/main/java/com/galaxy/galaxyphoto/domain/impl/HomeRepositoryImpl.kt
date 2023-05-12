package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.domain.service.HomeService
import com.galaxy.galaxyphoto.model.ImageModel
import com.galaxy.galaxyphoto.model.photo.PhotoModel
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import io.reactivex.rxjava3.core.Single

class HomeRepositoryImpl(
    private val context: Context,
    private val homeService: HomeService
) : HomeRepository {
    override fun getPhotoList(): Single<List<PhotoModel>> {
        return context.rxWithNetworkCheck {
            homeService.getPhoto()
        }.map {
            it.map { it.convertToModel() }
        }
    }

    override fun getPhotoFollowTags(tags: String): Single<ImageModel> {
        return context.rxWithNetworkCheck {
            homeService.getPhotoFollowTags(tags = tags)
        }.map {
            it.convertToModel()
        }
    }


}