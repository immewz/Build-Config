package com.mewz.buildconfig

import android.app.Application
import com.mewz.shared.data.models.RestaurantsModelImpl

class RestaurantDeliveryApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantsModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
    }
}