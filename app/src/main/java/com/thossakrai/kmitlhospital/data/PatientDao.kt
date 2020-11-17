package com.thossakrai.kmitlhospital.data

import androidx.room.*

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