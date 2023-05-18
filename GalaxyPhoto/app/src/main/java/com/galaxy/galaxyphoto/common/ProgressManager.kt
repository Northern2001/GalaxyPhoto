package com.galaxy.galaxyphoto.common

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProgressManager : ViewModel() {
    var isShowNotify by mutableStateOf(false)
    var isLoading by mutableStateOf(false)
    var contentNotify by mutableStateOf("")
    var isSuccess by mutableStateOf(false)

    companion object {
        val current = ProgressManager()
    }

    fun showNotify(content: String, isSuccess: Boolean) {
        current.isShowNotify = true
        current.contentNotify = content
        current.isSuccess = isSuccess

    }

    fun dismissShowNotify() {
        current.isShowNotify = false
    }

    fun dismissLoading() {
        current.isLoading = false
    }

    fun loading() {
        current.isLoading = true
    }

    fun onRefresh(){

    }
}
