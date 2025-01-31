package com.healtheye.healtheye.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtheye.healtheye.models.Measurement;
import com.healtheye.healtheye.models.Patient;

import java.util.List;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
  List<Measurement> findByPatientOrderByTimestampDesc(Patient patient);
}
