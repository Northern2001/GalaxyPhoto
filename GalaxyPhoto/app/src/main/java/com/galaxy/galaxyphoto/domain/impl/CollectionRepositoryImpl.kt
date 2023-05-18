package com.galaxy.galaxyphoto.domain.impl

import android.content.Context
import com.galaxy.galaxyphoto.domain.repository.CollectionRepository
import com.galaxy.galaxyphoto.domain.service.CollectionService
import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.networks.rxWithNetworkCheck
import io.reactivex.rxjava3.core.Single

class CollectionRepositoryImpl(
    private val context: Context,
    private val collectionService: CollectionService
) : CollectionRepository {

    override fun createCollection(
        title: String,
        description: String,
        privacy: Boolean
    ): Single<List<CollectionModel>> {
        return context.rxWithNetworkCheck {
            collectionService.createCollection(
                title = title,
                description = description,
                privacy = privacy
            )
        }.map {
            arrayListOf()
        }
    }


}