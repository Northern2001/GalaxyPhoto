package com.galaxy.galaxyphoto.networks

import android.content.Context
import com.galaxy.galaxyphoto.domain.helpe.Resource
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

fun <E> Context.rxWithNetworkCheck(
    handleNoNetwork: (() -> Unit)? = null,
    action: () -> Single<E>
): Single<E> {
    return RxNetwork.checkInternetNetwork(this, handleNoNetwork = handleNoNetwork)
        .flatMap {
            action()
        }
        .subscribeOn(Schedulers.io())
}
fun <E> Single<E>.subscribeByResource(
    result: (Resource<E>) -> Unit
): Disposable {
    return observeOn(AndroidSchedulers.mainThread())
        .subscribe(
            { result(Resource.Success(it)) },
            { result(Resource.ErrorList(it)) }
        )
}