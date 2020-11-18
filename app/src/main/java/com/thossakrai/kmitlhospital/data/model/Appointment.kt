package com.thossakrai.kmitlhospital.data.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.*

@Entity(tableName = "appointments")
data class Appointment(
    @PrimaryKey(autoGenerate = true) private val appId: String,
    val patientId: String,
    private val dateTime: Date,
    private val symptom: String,
    private val note: String,
)

data class AppointmentWithDoctor(
    @Embedded val appointment: Appointment,
    @Relation(
        parentColumn = "appId",
        entityColumn = "medicalLicenseId"
    )
    val doctor: Doctor
)