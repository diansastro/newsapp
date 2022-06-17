package com.widi.newsapp.data

import com.widi.newsapp.BuildConfig
import com.widi.newsapp.data.base.BaseNetwork
import okhttp3.OkHttpClient

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

abstract class AbstractNetwork<T>(): BaseNetwork<T>() {

    override fun getBaseUrl(): String = BuildConfig.BASE_URL

    override fun okHttpClientBuilder(builder: OkHttpClient.Builder): OkHttpClient.Builder {
//        builder.addInterceptor(ContentTypeInterceptor())
        return super.okHttpClientBuilder(builder)
    }
}