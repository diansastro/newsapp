package com.widi.newsapp.di.builder

import com.widi.newsapp.view.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun bindSplashActivity(): SplashActivity


}