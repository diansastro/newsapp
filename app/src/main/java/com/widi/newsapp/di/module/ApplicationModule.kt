package com.widi.newsapp.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun applicationContext(application: Application): Context = application
}