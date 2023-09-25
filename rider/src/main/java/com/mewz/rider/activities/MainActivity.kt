package com.mewz.rider.activities

import android.app.PendingIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.mewz.rider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            Log.d("firebase_token", it.result)
        }

//        sendNotification(this,
//            title = "Hello",
//            body = "This is the main and lengthy content of a notification. It is truncated into a single line when notification is collapsed, and is shown in multiple lines when notification is expanded.",
//            pendingIntent = PendingIntent.getActivity(this,
//            0,
//            RestaurantDetailActivity.newIntent(this),
//            PendingIntent.FLAG_UPDATE_CURRENT)
//        )

    }


}