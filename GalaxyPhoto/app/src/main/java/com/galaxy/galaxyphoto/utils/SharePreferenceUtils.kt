package com.galaxy.galaxyphoto.utils

import android.content.Context

object SharePreferenceUtils {
    private const val PREFERENCE_APP = "PREFERENCE_APP"
    const val ACCESS_TOKEN = "ACCESS_TOKEN"



    fun <T> savePreference(context: Context, key: String, value: T) {
        val editor = context.getSharedPreferences(PREFERENCE_APP, Context.MODE_PRIVATE)
        with(editor.edit()) {
            when (value) {
                is String -> putString(key, value)
                is Int -> putInt(key, value)
                is Boolean -> putBoolean(key, value)
                else -> {
                }
            }
            apply()
        }
    }

    fun <T> getPreference(context: Context, key: String, defaultValue: T): T? {
        val sharedPref = context.getSharedPreferences(PREFERENCE_APP, Context.MODE_PRIVATE)
        with(sharedPref) {
            when (defaultValue) {
                is String -> {
                    return getString(key, defaultValue) as T
                }
                is Boolean -> {
                    return getBoolean(key, defaultValue) as T
                }
            }
            return null
        }
    }
}

