package com.widi.newsapp.data.base

import retrofit2.Retrofit

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

class RetrofitHelper {

    companion object {
        var retrofit: Retrofit?= null

        fun init(retrofit: Retrofit){
            Companion.retrofit = retrofit
        }
    }
}