package com.example.patientmedicineappointment.repository;

import com.example.patientmedicineappointment.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

