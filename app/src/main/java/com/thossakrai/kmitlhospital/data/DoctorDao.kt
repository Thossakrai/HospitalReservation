package com.thossakrai.kmitlhospital.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface DoctorDao {
    @Transaction
    @Query("SELECT * FROM doctors")
    fun getAll() : List<Doctor>
}

