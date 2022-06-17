package com.widi.newsapp.di.component

import android.app.Application
import com.widi.newsapp.MainActivity
import com.widi.newsapp.di.builder.ActivityBuilder
import com.widi.newsapp.di.module.ApplicationModule
import com.widi.newsapp.di.module.NetModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

@Singleton
@Component(modules = [ApplicationModule::class, NetModule::class, ActivityBuilder::class, AndroidInjectionModule::class])

interface ApplicationComponent {

    fun Inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}