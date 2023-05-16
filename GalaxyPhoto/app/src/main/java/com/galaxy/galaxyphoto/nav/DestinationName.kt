package com.galaxy.galaxyphoto.nav

class DestinationName(isParam: Boolean = false) {
    val splashScreen = if (isParam) {
        "splashscreen"
    } else {
        "splashscreen"
    }

    val bottomBar = if (isParam) {
        "bottomBar"
    } else {
        "bottomBar"
    }

    val photoDetail = if (isParam) {
        "photoDetail?${ParamName.ID_PHOTO}={${ParamName.ID_PHOTO}}"
    } else {
        "photoDetail"
    }
    val profileScreen = if (isParam) {
        "profileScreen?${ParamName.USER_MODEL}={${ParamName.USER_MODEL}}"
    } else {
        "profileScreen"
    }
}