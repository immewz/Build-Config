package com.mewz.shared.mvp.presenters

import com.mewz.shared.mvp.views.MainView

interface MainPresenter {
    fun initPresenter(view: MainView)
    fun onUiReady()
}