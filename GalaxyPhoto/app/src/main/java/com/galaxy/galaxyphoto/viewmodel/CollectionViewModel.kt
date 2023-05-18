package com.galaxy.galaxyphoto.viewmodel

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.galaxy.galaxyphoto.base.BaseViewModel
import com.galaxy.galaxyphoto.common.ProgressManager
import com.galaxy.galaxyphoto.domain.repository.CollectionRepository
import com.galaxy.galaxyphoto.model.collection.CollectionModel
import com.galaxy.galaxyphoto.networks.subscribeToResource

class CollectionViewModel(
    private val collectionRepository: CollectionRepository
) : BaseViewModel() {
    var collectionModel by mutableStateOf(CollectionModel())

    fun createCollections(
        context: Context,
        title: String,
        description: String,
        privacy: Boolean,
    ) {
        collectionRepository.createCollection(
            title = title,
            description = description,
            privacy = privacy
        ).subscribeToResource(context, onError = {}
        ) {
            ProgressManager.current.showNotify("Create Success", true)
        }
    }
}