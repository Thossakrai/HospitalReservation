package com.thossakrai.kmitlhospital.data.dao

import androidx.room.*
import com.thossakrai.kmitlhospital.data.model.Patient
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointments
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointmentsAndDoctor

@Dao
interface PatientDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPatient(patient: Patient)

    @Transaction
    @Query("SELECT * FROM patients")
    fun getPatientWithAppointments(): List<PatientWithAppointments>

    @Transaction
    @Query("SELECT * FROM patients")
    fun getPatientWithAppointmentsAndDoctor(): List<PatientWithAppointmentsAndDoctor>

}