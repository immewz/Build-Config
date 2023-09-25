package com.mewz.shared.network

import com.mewz.shared.network.responses.GetRestaurantsResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface RestaurantApi {

    @GET(ENDPOINT_GET_RESTAURANTS)
    fun getRestaurants() : Observable<GetRestaurantsResponse>
}