package com.healtheye.healtheye.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.healtheye.healtheye.Services.PatientService;
import com.healtheye.healtheye.models.Patient;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientController {
  @Autowired
  private PatientService patientService;

  @GetMapping
  public List<Patient> getAllPatients() {
    return patientService.getAllPatients();
  }

  @GetMapping("/{patientId}")
  public Patient getPatient(@PathVariable Long patientId) {
    return patientService.getPatientById(patientId);
  }

  @PostMapping
  public Patient createPatient(@RequestBody Patient patient) {
    return patientService.savePatient(patient);
  }

  @DeleteMapping("/{patientId}")
  public void deletePatient(@PathVariable Long patientId) {
    patientService.deletePatient(patientId);
  }
}
