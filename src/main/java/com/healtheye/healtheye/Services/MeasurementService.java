package com.healtheye.healtheye.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtheye.healtheye.Repositories.MeasurementRepository;
import com.healtheye.healtheye.models.Measurement;
import com.healtheye.healtheye.models.Patient;

import java.util.List;

@Service
public class MeasurementService {
  @Autowired
  private MeasurementRepository measurementRepository;

  public List<Measurement> getMeasurementsByPatient(Patient patient) {
    return measurementRepository.findByPatientOrderByTimestampDesc(patient);
  }

  public Measurement saveMeasurement(Measurement measurement) {
    return measurementRepository.save(measurement);
  }
}
