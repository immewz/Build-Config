package com.mewz.buildconfig.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mewz.buildconfig.R
import com.mewz.buildconfig.viewholders.RestaurantViewHolder
import com.mewz.shared.data.vos.RestaurantVO

class RestaurantListAdapter: RecyclerView.Adapter<RestaurantViewHolder>() {

    private var mData: List<RestaurantVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder_restaurant, parent, false)
        return RestaurantViewHolder(view.rootView)
    }

    override fun getItemCount(): Int {
        return mData.count()
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        if (mData.isNotEmpty()){
            holder.bindData(mData[position])
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(restaurants: List<RestaurantVO>) {
        mData = restaurants
        notifyDataSetChanged()
    }
}