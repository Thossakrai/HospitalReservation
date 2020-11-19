package com.thossakrai.kmitlhospital.data.repository

import com.thossakrai.kmitlhospital.data.dao.DoctorDao
import com.thossakrai.kmitlhospital.data.model.Doctor
import kotlinx.coroutines.flow.Flow

class DoctorRepository(private val doctorDao: DoctorDao) {
    val doctor: Flow<List<Doctor>> = doctorDao.getAll()
}