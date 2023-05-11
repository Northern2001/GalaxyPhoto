//package com.example.galaxy_photo.helper
//
//import android.content.Context
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import okhttp3.Response
//import okhttp3.logging.HttpLoggingInterceptor
//
//fun OkHttpClient.Builder.attachAppInterceptor(
//    context: Context,
//    type: String
//): OkHttpClient.Builder {
//    val interceptor = HttpLoggingInterceptor()
//    interceptor.level = HttpLoggingInterceptor.Level.HEADERS
//    interceptor.level = HttpLoggingInterceptor.Level.BODY
//    return addInterceptor(AppInfoInterceptor())
//        .addInterceptor(
//            AuthorizationInterceptor(
//                context = context,
//                type = type
//            )
//        )
//        .addInterceptor(HandleErrorInterceptor())
//        .addInterceptor(interceptor)
//}
//
////class AppInfoInterceptor : Interceptor {
////    override fun intercept(chain: Interceptor.Chain): Response {
////        val request = chain.request().newBuilder()
////            .build()
////        return chain.proceed(request)
////    }
////}
////
////class AuthorizationInterceptor(
////    private val context: Context,
////    private val type: String,
////) : Interceptor {
////    override fun intercept(chain: Interceptor.Chain): Response {
////        val builder = chain.request().newBuilder()
////        val isRefresh = chain.request().url.encodedPath.contains("refresh-token")
////        if (context.getAccessToken().isNotEmpty() && isRefresh.not()) {
////            builder.addHeader(
////                "key",
////                "KEY"
////            )
////            if (type == TypeBaseUrl.TYPE_BASE_URL_CHAT.type) {
////                builder.addHeader(
////                    "Chat-Token",
////                    context.getChatAccessToken()
////                )
////            }
////        }
////        return chain.proceed(builder.build())
////    }
////
////}
////
////class HandleErrorInterceptor : Interceptor {
////
////    override fun intercept(chain: Interceptor.Chain): Response {
////        return chain.proceed(chain.request()).also {
////            if (it.isSuccessful.not()) {
////                // Code out of 200..299 -> general error
////                throw RawErrorResponse(it.code, it.body?.string())
////            }
////        }
////    }
////
////}