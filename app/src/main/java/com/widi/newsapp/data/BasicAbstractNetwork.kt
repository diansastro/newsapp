package com.widi.newsapp.data

import android.content.Context
import com.widi.newsapp.data.interceptor.ContentTypeInterceptor
import okhttp3.OkHttpClient

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

abstract class BasicAbstractNetwork<T>(private val context: Context): AbstractNetwork<T>() {

    override fun okHttpClientBuilder(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        builder.addInterceptor(ContentTypeInterceptor())
        return super.okHttpClientBuilder(builder)
    }

    fun getNetworkService(): T {
        return networkService()
    }
}