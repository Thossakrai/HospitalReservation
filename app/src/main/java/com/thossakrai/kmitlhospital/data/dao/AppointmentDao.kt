package com.thossakrai.kmitlhospital.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.thossakrai.kmitlhospital.data.model.AppointmentWithDoctor

@Dao
interface AppointmentDao {
    @Transaction
    @Query("SELECT * From appointments")
    fun getAppointmentWithDoctor(): AppointmentWithDoctor
}