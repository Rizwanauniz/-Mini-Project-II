package com.example.patientmedicineappointment.controller;

import com.example.patientmedicineappointment.entity.Medication;
import com.example.patientmedicineappointment.service.MedicationService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {
    private final MedicationService medicationService;

    public MedicationController(MedicationService medicationService) {
        this.medicationService = medicationService;
    }

    @GetMapping
    public List<Medication> getAllMedications() {
        return medicationService.getAllMedications();
    }

    @PostMapping
    public Medication saveMedication(@RequestBody Medication medication) {
        return medicationService.saveMedication(medication);
    }
}
