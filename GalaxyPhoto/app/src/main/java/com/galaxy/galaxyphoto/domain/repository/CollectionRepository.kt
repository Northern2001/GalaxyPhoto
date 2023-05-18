package com.galaxy.galaxyphoto.domain.repository

import com.galaxy.galaxyphoto.model.collection.CollectionModel
import io.reactivex.rxjava3.core.Single

interface CollectionRepository {
    fun createCollection(
        title: String,
        description: String,
        privacy: Boolean
    ): Single<List<CollectionModel>>

}