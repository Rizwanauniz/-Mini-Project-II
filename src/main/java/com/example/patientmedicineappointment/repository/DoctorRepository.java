package com.example.patientmedicineappointment.repository;

import com.example.patientmedicineappointment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
