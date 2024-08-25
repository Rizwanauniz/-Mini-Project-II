package com.example.patientmedicineappointment.repository;

import com.example.patientmedicineappointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
