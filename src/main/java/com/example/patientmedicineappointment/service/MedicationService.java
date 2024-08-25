package com.example.patientmedicineappointment.service;

import com.example.patientmedicineappointment.entity.Medication;
import com.example.patientmedicineappointment.repository.MedicationRepository;

import java.util.List;

public class MedicationService {
    private final MedicationRepository medicationRepository;

    public MedicationService(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public Medication saveMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

}

