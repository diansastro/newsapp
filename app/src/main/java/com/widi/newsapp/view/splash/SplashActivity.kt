package com.widi.newsapp.view.splash

import com.widi.newsapp.R
import com.widi.newsapp.base.BaseMvpActivity
import dagger.android.AndroidInjection
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

class SplashActivity: BaseMvpActivity<SplashPresenter>(), SplashContract.View {

    @Inject
    override lateinit var presenter: SplashPresenter

    override fun initPresenterView() {
        presenter.view = this
    }

    override fun injectView() {
        AndroidInjection.inject(this)
    }

    override fun setup() {
        initSplash()
    }

    override fun getLayout(): Int = R.layout.activity_splah

    private fun initSplash() = addUiSubscription(
        Observable.timer(2, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
//                startActivity(intentFor<MovieActivity>())
                finish()
            }
    )
}