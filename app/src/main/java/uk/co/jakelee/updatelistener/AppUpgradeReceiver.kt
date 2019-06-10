package uk.co.jakelee.updatelistener

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AppUpgradeReceiver : BroadcastReceiver() {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context == null) {
            return
        }
        Toast.makeText(context, "Updated to ${BuildConfig.VERSION_NAME}!", Toast.LENGTH_LONG).show()
    }


}