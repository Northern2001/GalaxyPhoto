package com.galaxy.galaxyphoto.ext

import android.content.Context
import com.galaxy.galaxyphoto.utils.SharePreferenceUtils

fun Context.getAccessToken() = SharePreferenceUtils.getPreference(
    this,
    SharePreferenceUtils.ACCESS_TOKEN, ""
) ?: ""