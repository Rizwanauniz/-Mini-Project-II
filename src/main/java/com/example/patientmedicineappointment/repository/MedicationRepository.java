package com.example.patientmedicineappointment.repository;

import com.example.patientmedicineappointment.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
