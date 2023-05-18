package com.galaxy.galaxyphoto.reponse.auth

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class AuthResponse(
    @SerializedName("access_token")
    val accessToken: String? = null,
    @SerializedName("created_at")
    val createdAt: Int? = null,
    @SerializedName("scope")
    val scope: String? = null,
    @SerializedName("tokenType")
    val tokenType: String? = null,
){
    fun convertToModel () = AuthModel(
        accessToken = this.accessToken?:"",
        createdAt = this.createdAt?:0,
        scope = this.scope?:"",
        tokenType = this.tokenType?:""
    )
}
@Parcelize
data class AuthModel(
    val accessToken: String = "",
    val createdAt: Int = 0,
    val scope: String = "",
    val tokenType: String = "",
) : Parcelable