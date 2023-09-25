package com.mewz.rider.activities.notification

import android.app.PendingIntent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.mewz.rider.activities.RestaurantDetailActivity
import com.mewz.rider.activities.sendNotification

class FCMService: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("firebase_token", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        Log.d("message", message.toString())
        sendNotification(
            context = this,
            title = message.data["title"] ?: " ",
            body = message.data["body"] ?: " ",
            pendingIntent = PendingIntent.getActivity(this, 0,
            RestaurantDetailActivity.newIntent(this),
            PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}