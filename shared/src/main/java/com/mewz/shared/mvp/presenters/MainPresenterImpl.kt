package com.mewz.shared.mvp.presenters

import androidx.lifecycle.ViewModel
import com.mewz.shared.data.models.RestaurantsModel
import com.mewz.shared.data.models.RestaurantsModelImpl
import com.mewz.shared.mvp.views.MainView

class MainPresenterImpl: MainPresenter, ViewModel() {

    var mView: MainView? = null

    private var mRestaurantsModel: RestaurantsModel = RestaurantsModelImpl

    override fun initPresenter(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantsModel.getRestaurants(
            onSuccess = {mView?.showRestaurants(it)},
            onFailure = {mView?.showError(it)}
        )
    }
}