package com.thossakrai.kmitlhospital.data.repository

import androidx.annotation.WorkerThread
import com.thossakrai.kmitlhospital.data.dao.PatientDao
import com.thossakrai.kmitlhospital.data.model.Patient
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointments
import kotlinx.coroutines.flow.Flow

class PatientRepository(private val patientDao: PatientDao) {
    val patient: Patient = patientDao.getPatient()

    val allPatient: Flow<List<PatientWithAppointments>> = patientDao.getPatientWithAppointments()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(patient: Patient) {
        patientDao.insert(patient)
    }

}


