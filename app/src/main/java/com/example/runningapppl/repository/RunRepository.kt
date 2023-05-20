package com.example.runningapppl.repository

import com.example.runningapppl.database.RunDao
import javax.inject.Inject

class RunRepository @Inject constructor(private val runDao: RunDao) {
}