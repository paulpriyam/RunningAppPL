package com.example.runningapppl.service

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.example.runningapppl.utils.Constants.Companion.ACTION_ON_PAUSE_SERVICE
import com.example.runningapppl.utils.Constants.Companion.ACTION_ON_START_OR_RESUME_SERVICE
import com.example.runningapppl.utils.Constants.Companion.ACTION_ON_STOP_SERVICE
import timber.log.Timber

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when (it.action) {
                ACTION_ON_START_OR_RESUME_SERVICE -> {
                    Timber.d("start service started")
                }
                ACTION_ON_PAUSE_SERVICE -> {
                    Timber.d("on pause service started")
                }
                ACTION_ON_STOP_SERVICE -> {
                    Timber.d("on stop service started")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }
}