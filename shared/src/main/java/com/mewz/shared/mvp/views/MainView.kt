package com.mewz.shared.mvp.views

import com.mewz.shared.data.vos.RestaurantVO

interface MainView {
    fun showRestaurants(restaurants: List<RestaurantVO>)
    fun showError(errorMessage: String)
}