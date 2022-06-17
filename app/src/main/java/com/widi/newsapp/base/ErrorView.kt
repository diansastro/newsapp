package com.widi.newsapp.base

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

interface ErrorView {
    fun errorScreen(message: String? = "", code: Int? = -1)
    fun errorScreen(message: String? = "")
    fun forceLogout()
}