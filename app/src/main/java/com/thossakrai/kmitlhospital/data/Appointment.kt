package com.thossakrai.kmitlhospital.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Appointment(
    @PrimaryKey(autoGenerate = true) private val appId: String,
    val patientId: String,
    private val dateTime: Date,
    private val symptom: String,
    private val note: String,
)
