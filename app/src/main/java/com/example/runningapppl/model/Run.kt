package com.example.runningapppl.model

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class Run(
    var img: Bitmap? = null,
    var timeStamp: Long = 0L,
    var timeInMillis: Long = 0L,
    var avgSpeedInKMH: Float? = 0F,
    var caloriesBurnt: Int? = 0,
    var distanceInMeters: Int? = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
