package com.galaxy.galaxyphoto.networks

import android.content.Context
import com.galaxy.galaxyphoto.domain.helpe.Resource
import com.galaxy.galaxyphoto.domain.helpe.exception
import com.galaxy.galaxyphoto.domain.helpe.isError
import com.galaxy.galaxyphoto.domain.helpe.isSuccess
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.Disposable

fun <E : Any> Single<E>.subscribeToResource(
    context: Context,
    onError: ((Throwable) -> Unit?)? = null,
    onSuccess: ((Resource<E>) -> Unit?)? = null,
): Disposable {
    return doOnSubscribe {}.subscribeByResource {
        when {
            it.isSuccess() -> {
                onSuccess?.invoke(it)
            }
            it.isError() -> {
                onError?.invoke(it.exception())
            }
        }
    }
}
