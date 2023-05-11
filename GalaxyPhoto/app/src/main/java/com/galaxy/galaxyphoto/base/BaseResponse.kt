package com.galaxy.galaxyphoto.base

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("data")
    val data: T? = null,

    @SerializedName("meta")
    val meta: List<MetaResponse>,
)

data class MetaResponse(
    @SerializedName("code")
    val code: Int?,
    @SerializedName("message")
    val message: String?
)