package com.galaxy.galaxyphoto.common

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProgressManager : ViewModel() {
    var isShowNotify by mutableStateOf(false)
    var contentNotify by mutableStateOf("")

    companion object {
        val current = ProgressManager()
    }

    fun showNotify(content: String) {
        current.isShowNotify = true
        current.contentNotify = content

    }

    fun dismissShowNotify() {
        current.isShowNotify = false
    }
}
