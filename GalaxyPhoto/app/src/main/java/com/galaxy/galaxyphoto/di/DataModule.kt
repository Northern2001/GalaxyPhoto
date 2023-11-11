package com.galaxy.galaxyphoto.di

import android.content.Context
import com.galaxy.galaxyphoto.BuildConfig.BASE_URL
import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.domain.impl.AuthRepositoryImpl
import com.galaxy.galaxyphoto.domain.impl.CollectionRepositoryImpl
import com.galaxy.galaxyphoto.domain.impl.HomeRepositoryImpl
import com.galaxy.galaxyphoto.domain.repository.AuthRepository
import com.galaxy.galaxyphoto.domain.repository.CollectionRepository
import com.galaxy.galaxyphoto.domain.repository.HomeRepository
import com.galaxy.galaxyphoto.domain.service.AuthService
import com.galaxy.galaxyphoto.domain.service.CollectionService
import com.galaxy.galaxyphoto.domain.service.HomeService
import com.galaxy.galaxyphoto.helper.JsonHelper
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val apisModule = module {
    single { JsonHelper.gson }

    single<HomeService> {
        createWebService(
            context = get(),
            baseUrl = BASE_URL,
            gson = get()
        )
    }

    single<CollectionService> {
        createWebService(
            context = get(),
            baseUrl = BASE_URL,
            gson = get()
        )
    }

    single<AuthService> {
        createWebService(
            context = get(),
            baseUrl = Contains.BASE_URL_AUTH,
            gson = get()
        )
    }

    factory<HomeRepository> {
        HomeRepositoryImpl(get(), get())
    }

    factory<CollectionRepository> {
        CollectionRepositoryImpl(get(), get())
    }

    factory<AuthRepository> {
        AuthRepositoryImpl(get(), get())
    }

}

inline fun <reified T> createWebService(
    context: Context,
    baseUrl: String,
    gson: Gson
): T {
    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.HEADERS
    interceptor.level = HttpLoggingInterceptor.Level.BODY

//    var client: OkHttpClient = OkHttpClient.Builder()
//        .addInterceptor(interceptor)
//        .readTimeout(100000L, TimeUnit.MILLISECONDS)
//        .writeTimeout(100000L, TimeUnit.MILLISECONDS)
//        .connectTimeout(100000L, TimeUnit.MILLISECONDS)
//        .cache(null)
//        .addInterceptor(Interceptor { chain ->
//            val newRequest: Request = chain.request().newBuilder()
//                .addHeader("Authorization", "Bearer ${Contains.TOKEN_KEY}")
//                .build()
//            chain.proceed(newRequest)
//        }).build()

    return Retrofit.Builder()
        .addCallAdapterFactory(RxJava3CallAdapterFactory.createSynchronous())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .baseUrl(baseUrl)
        .client(
            OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .readTimeout(100000L, TimeUnit.MILLISECONDS)
                .writeTimeout(100000L, TimeUnit.MILLISECONDS)
                .connectTimeout(100000L, TimeUnit.MILLISECONDS)
                .cache(null)
                .build()
        )
        .build().create(T::class.java)
}