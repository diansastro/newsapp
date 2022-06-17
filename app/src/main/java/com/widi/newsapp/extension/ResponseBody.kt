package com.widi.newsapp.extension

import org.json.JSONObject

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

fun String.getErrorMessage(default: String) : String? {
    var message: String? = null
    var jsonObject: JSONObject? = null
    try {
        jsonObject = JSONObject(this)
    } catch (e: Exception) {
    }
    return jsonObject.getErrorMessage(default)
}

fun JSONObject?.getErrorMessage(default: String): String? {
    var message: String? = null
    if (message.isNullOrEmpty()) {
        try {
            this?.let {
                message = it.getJSONObject("meta").getString("message")
            }
        } catch (e: Exception) {
        }
    }
    if (message.isNullOrEmpty()) {
        message = default
    }
    return message
}