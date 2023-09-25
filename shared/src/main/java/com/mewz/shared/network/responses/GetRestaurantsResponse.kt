package com.mewz.shared.network.responses

import com.google.gson.annotations.SerializedName
import com.mewz.shared.data.vos.RestaurantVO

data class GetRestaurantsResponse(

    @SerializedName("code")
    val code: Int?,

    @SerializedName("message")
    val message: String?,

    @SerializedName("data")
    val data: List<RestaurantVO>?
)
