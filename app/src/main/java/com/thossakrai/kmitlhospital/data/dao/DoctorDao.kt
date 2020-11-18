package com.thossakrai.kmitlhospital.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.thossakrai.kmitlhospital.data.model.Doctor

@Dao
interface DoctorDao {
    @Transaction
    @Query("SELECT * FROM doctors")
    fun getAll() : List<Doctor>
}

