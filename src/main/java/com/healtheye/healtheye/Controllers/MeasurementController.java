package com.healtheye.healtheye.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.healtheye.healtheye.Services.MeasurementService;
import com.healtheye.healtheye.models.Measurement;
import com.healtheye.healtheye.models.Patient;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/measurements")
public class MeasurementController {
  @Autowired
  private MeasurementService measurementService;

  @GetMapping("/patient/{patientId}")
  public List<Measurement> getMeasurementsByPatient(@PathVariable Long patientId) {
    Patient patient = new Patient();
    patient.setPatientId(patientId);
    return measurementService.getMeasurementsByPatient(patient);
  }

  @PostMapping
  public Measurement createMeasurement(@RequestBody Measurement measurement) {
    return measurementService.saveMeasurement(measurement);
  }
}

