package com.example.runningapppl.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.runningapppl.model.Run

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY timeStamp DESC")
    fun getAllRunDataSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunDataSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getAllRunDataSortedByDistance(): LiveData<List<Run>>


    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getAllRunDataSortedByDuration(): LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM run_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("SELECT SUM(distanceInMeters) FROM run_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT SUM(caloriesBurnt) FROM run_table")
    fun getTotalCaloriesBurnt(): LiveData<Int>

    @Query("SELECT SUM(avgSpeedInKMH) FROM run_table")
    fun getTotalAvgSpeed(): LiveData<Float>
}