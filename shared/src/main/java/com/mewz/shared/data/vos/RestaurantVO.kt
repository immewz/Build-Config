package com.mewz.shared.data.vos

import com.google.gson.annotations.SerializedName

data class RestaurantVO(

    @SerializedName("name")
    val name: String?,

    @SerializedName("category")
    val category: String?,

    @SerializedName("delivery_price")
    val deliveryPrice: Int?,

    @SerializedName("rating")
    val rating: Float?,

    @SerializedName("image_url")
    val imageUrl: String?
)
