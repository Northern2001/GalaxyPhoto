package com.galaxy.galaxyphoto.nav

object DestinationNameWithParam {

    fun getPhotoDetail(idPhoto: String): String {
        return "${DestinationName().photoDetail}?${ParamName.ID_PHOTO}=${idPhoto}"
    }

    fun getLoginWebView(url: String): String {
        return "${DestinationName().loginWebView}?${ParamName.URL_WEB_VIEW}=${url}"
    }

    fun getUserProfile(userModel: String): String {
        return "${DestinationName().profileScreen}?${ParamName.USER_MODEL}=${userModel}"
    }

}