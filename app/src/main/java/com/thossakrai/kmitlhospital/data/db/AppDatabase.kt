package com.thossakrai.kmitlhospital.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.thossakrai.kmitlhospital.data.dao.AppointmentDao
import com.thossakrai.kmitlhospital.data.dao.DoctorDao
import com.thossakrai.kmitlhospital.data.dao.PatientDao
import com.thossakrai.kmitlhospital.data.model.Appointment
import com.thossakrai.kmitlhospital.data.model.Doctor
import com.thossakrai.kmitlhospital.data.model.Patient

@Database(entities = [Patient::class, Doctor::class, Appointment::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun patientDao() : PatientDao
    abstract fun doctorDao() : DoctorDao
    abstract fun appointmentDao() : AppointmentDao
}
