package com.thossakrai.kmitlhospital.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doctors")
data class Doctor(
    @PrimaryKey private val medicalLicenseId: String,
    val name: String,
    val lastName: String,
    val specialisation: String,
)



