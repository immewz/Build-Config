package com.mewz.shared.data.models

import com.mewz.shared.data.vos.RestaurantVO

interface RestaurantsModel {
    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}