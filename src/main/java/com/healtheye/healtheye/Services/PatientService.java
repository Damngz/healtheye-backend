package com.healtheye.healtheye.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtheye.healtheye.Repositories.PatientRepository;
import com.healtheye.healtheye.models.Patient;

import java.util.List;

@Service
public class PatientService {
  @Autowired
  private PatientRepository patientRepository;

  public List<Patient> getAllPatients() {
    return patientRepository.findAll();
  }

  public Patient getPatientById(Long patientId) {
    return patientRepository.findById(patientId).orElse(null);
  }

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  public void deletePatient(Long patientId) {
    patientRepository.deleteById(patientId);
  }
}
