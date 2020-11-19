package com.thossakrai.kmitlhospital.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.thossakrai.kmitlhospital.data.model.Doctor
import kotlinx.coroutines.flow.Flow

@Dao
interface DoctorDao {
    @Transaction
    @Query("SELECT * FROM doctors")
    fun getAll() : Flow<List<Doctor>>
}

