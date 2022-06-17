package com.widi.newsapp.base

/**
 * Created by widi (widiytk@gmail.com) on 18/06/22.
 **/

abstract class BaseMvpActivity<T: BasePresenter<*>>: BaseActivity() {
    protected abstract var presenter: T

    override fun internalSetup() {
        initPresenterView()
        super.internalSetup()
    }

    abstract fun initPresenterView()

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}