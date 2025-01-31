package com.healtheye.healtheye.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtheye.healtheye.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
