package com.galaxy.galaxyphoto.base

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {
    protected val compositeDisposable = CompositeDisposable()

    fun stopAll() {
        compositeDisposable.clear()
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }

}