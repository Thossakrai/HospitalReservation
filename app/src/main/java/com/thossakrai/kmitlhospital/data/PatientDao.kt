package com.thossakrai.kmitlhospital.data

import androidx.room.*

@Dao
interface PatientDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPatient(patient: Patient)

    @Transaction
    @Query("SELECT * From patients")
    fun getPatientWithAppointment() : List<PatientWithAppointments>



}