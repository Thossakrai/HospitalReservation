package com.thossakrai.kmitlhospital.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation
import java.util.*

@Entity(tableName = "patients")
data class Patient(
        @PrimaryKey private val nationalId: String,
        private val name: String?,
        private val lastName: String?,
        private val birthDate: Date,
)


data class PatientWithAppointments(
        @Embedded val patient: Patient,
        @Relation(
                parentColumn = "nationalId",
                entityColumn = "appId"
        )
        val appointment: List<Appointment>
)

data class PatientWithAppointmentsAndDoctor(
        @Embedded val patient: Patient,
        @Relation(
                entity = Appointment::class,
                parentColumn = "nationalId",
                entityColumn = "appId"
        )
        val appointmens: List<AppointmentWithDoctor>
)