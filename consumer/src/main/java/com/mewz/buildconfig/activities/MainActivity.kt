package com.mewz.buildconfig.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mewz.buildconfig.R
import com.mewz.buildconfig.adapters.RestaurantListAdapter
import com.mewz.buildconfig.databinding.ActivityMainBinding
import com.mewz.shared.data.vos.RestaurantVO
import com.mewz.shared.mvp.presenters.MainPresenter
import com.mewz.shared.mvp.presenters.MainPresenterImpl
import com.mewz.shared.mvp.views.MainView
import com.mewz.shared.showSnackBar

class MainActivity : AppCompatActivity(), MainView{

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: RestaurantListAdapter

    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpToolbar()
        setUpPresenter()
        setUpRecyclerView()

        mPresenter.onUiReady()
    }

    private fun setUpRecyclerView() {
        mAdapter = RestaurantListAdapter()
        with(binding.rvRestaurantList){
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this).get(MainPresenterImpl::class.java)
        mPresenter.initPresenter(this)
    }

    private fun setUpToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Welcome to ${getString(R.string.app_name)}"
    }

    override fun showRestaurants(restaurants: List<RestaurantVO>) {
        mAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
        Log.d("MainActivity",errorMessage)
    }
}