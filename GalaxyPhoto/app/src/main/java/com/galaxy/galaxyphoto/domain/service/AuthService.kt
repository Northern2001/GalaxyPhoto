package com.galaxy.galaxyphoto.domain.service

import com.galaxy.galaxyphoto.domain.Contains
import com.galaxy.galaxyphoto.reponse.auth.AuthResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {

    @POST("oauth/authorize")
    fun getAccessToken(
        @Query("client_id") key: String = Contains.ACCESS_KEY,
        @Query("redirect_uri") redirectUri: String = Contains.REDIRECT_URI,
        @Query("response_type") responseType: String = "code",
        @Query("scope") scope: String = "public"
    ): Single<Boolean>

  @POST("oauth/token")
    fun createAccessToken(
        @Query("client_id") access: String = Contains.ACCESS_KEY,
        @Query("client_secret") key: String = Contains.SECRET_KEY,
        @Query("redirect_uri") redirectUri: String = Contains.REDIRECT_URI,
        @Query("code") responseType: String = "iiMrPhTwQSauAcBlci3P0xxfxYRNDlKL6xh4JCz2CpE",
        @Query("grant_type") scope: String = "authorization_code"
    ): Single<AuthResponse>

}