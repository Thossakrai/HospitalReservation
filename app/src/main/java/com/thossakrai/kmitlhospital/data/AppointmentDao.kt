package com.thossakrai.kmitlhospital.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface AppointmentDao {
    @Transaction
    @Query("SELECT * From appointments")
    fun getAppointmentWithDoctor(): AppointmentWithDoctor
}