package com.mewz.rider.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mewz.rider.R
import com.mewz.rider.databinding.ActivityRestaurantDetailBinding

class RestaurantDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantDetailBinding

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,RestaurantDetailActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}