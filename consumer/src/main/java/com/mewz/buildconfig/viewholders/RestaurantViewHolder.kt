package com.mewz.buildconfig.viewholders

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mewz.buildconfig.databinding.ViewHolderRestaurantBinding
import com.mewz.shared.data.vos.RestaurantVO

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var binding: ViewHolderRestaurantBinding

    init {
        binding = ViewHolderRestaurantBinding.bind(itemView)
    }

    fun bindData(data: RestaurantVO) {

        Glide.with(itemView.context)
            .load(data.imageUrl)
            .into(binding.ivRestaurantImage)

        binding.tvRestaurantName.text = data.name
        binding.tvCategory.text = data.category
        binding.tvDeliveryPrice.text = "${data.deliveryPrice.toString()} MMK"
        binding.tvRating.text = data.rating.toString()
    }
}