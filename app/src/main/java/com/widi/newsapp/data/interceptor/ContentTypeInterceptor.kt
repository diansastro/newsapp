package com.widi.newsapp.data.interceptor

import com.widi.newsapp.BuildConfig
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

class ContentTypeInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val uri = request.url()
            .newBuilder()
            .addQueryParameter("api_key", BuildConfig.NEWS_API_KEY).build()
        val rq = request.newBuilder().url(uri).build()
        addHeader(rq)
        return chain.proceed(rq)
    }

    fun addHeader(oriRequest: Request): Request {
        return oriRequest.newBuilder().addHeader("Content-Type","application/json").build()
    }
}