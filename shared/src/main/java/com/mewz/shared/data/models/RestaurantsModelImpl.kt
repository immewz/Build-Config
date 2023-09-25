package com.mewz.shared.data.models

import android.annotation.SuppressLint
import com.mewz.shared.data.vos.RestaurantVO
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object RestaurantsModelImpl : RestaurantsModel, BaseModel() {

    @SuppressLint("CheckResult")
    override fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRestaurantApi.getRestaurants()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onSuccess(it.data ?: listOf())
            }, {
                onFailure(it.localizedMessage ?: "No Internet Connection")
            })
    }
}