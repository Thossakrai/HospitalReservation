package com.thossakrai.kmitlhospital.data.dao

import androidx.room.*
import com.thossakrai.kmitlhospital.data.model.Patient
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointments
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointmentsAndDoctor
import kotlinx.coroutines.flow.Flow

@Dao
interface PatientDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(patient: Patient)

    @Transaction
    @Query("SELECT * FROM patients")
    fun getPatient(): Patient
    @Transaction
    @Query("SELECT * FROM patients")
    fun getPatientWithAppointments(): Flow<List<PatientWithAppointments>>

    @Transaction
    @Query("SELECT * FROM patients")
    fun getPatientWithAppointmentsAndDoctor(): List<PatientWithAppointmentsAndDoctor>

}