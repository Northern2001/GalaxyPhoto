package com.galaxy.galaxyphoto.networks

import android.content.Context
import android.net.ConnectivityManager
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

object RxNetwork {

    fun checkInternetNetwork(
        context: Context,
        handleNoNetwork: (() -> Unit)? = null
    ): Single<Unit> {
        return Single.fromCallable {
//            context.isNetworkConnected()
            if (context.isNetworkConnected().not()) {
                if (handleNoNetwork != null) {
                    throw NeedLoadDBException()
                }
                throw NoNetworkException()
            }
        }.subscribeOn(Schedulers.io())
    }
}

fun Context.isNetworkConnected(): Boolean {
    val cm =
        applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
    cm ?: return false

    val network = cm.activeNetwork
    if (network != null) {
        val networkCapabilities = cm.getNetworkCapabilities(network)
        return networkCapabilities != null
    }
    return false
}
