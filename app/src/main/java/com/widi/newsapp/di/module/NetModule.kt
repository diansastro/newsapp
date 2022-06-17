package com.widi.newsapp.di.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

@Module
class NetModule {

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()
}