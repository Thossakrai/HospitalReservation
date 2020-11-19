package com.thossakrai.kmitlhospital.viewmodel


import androidx.lifecycle.*
import com.thossakrai.kmitlhospital.data.model.Patient
import com.thossakrai.kmitlhospital.data.model.PatientWithAppointments
import com.thossakrai.kmitlhospital.data.repository.PatientRepository
import kotlinx.coroutines.launch

class PatientViewModel(private val repository: PatientRepository) : ViewModel() {

    val patient: Patient = repository.patient
    val patientWithAppointments : LiveData<List<PatientWithAppointments>> = repository.allPatient.asLiveData()

    fun insert(patient: Patient) = viewModelScope.launch {
        repository.insert(patient)
    }
}

class PatientViewModelFactory(private val repository: PatientRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PatientViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return PatientViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}