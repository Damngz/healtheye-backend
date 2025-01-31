package com.healtheye.healtheye.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "measurements")
public class Measurement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "measurement_id")
  private Long measurementId;

  @ManyToOne
  @JoinColumn(name = "patient_id", nullable = false)
  private Patient patient;

  @Column(name = "heart_rate", nullable = false)
  private int heartRate;

  @Column(name = "systolic_pressure", nullable = false)
  private int systolicPressure;

  @Column(name = "diastolic_pressure", nullable = false)
  private int diastolicPressure;

  @Column(name = "oxygen_saturation", nullable = false)
  private int oxygenSaturation;

  @Column(name = "body_temperature", nullable = false)
  private double bodyTemperature;

  @Column(name = "timestamp", nullable = false)
  private Timestamp timestamp;

  // Getters and Setters
  public Long getMeasurementId() {
    return measurementId;
  }

  public void setMeasurementId(Long measurementId) {
    this.measurementId = measurementId;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public int getHeartRate() {
    return heartRate;
  }

  public void setHeartRate(int heartRate) {
    this.heartRate = heartRate;
  }

  public int getSystolicPressure() {
    return systolicPressure;
  }

  public void setSystolicPressure(int systolicPressure) {
    this.systolicPressure = systolicPressure;
  }

  public int getDiastolicPressure() {
    return diastolicPressure;
  }

  public void setDiastolicPressure(int diastolicPressure) {
    this.diastolicPressure = diastolicPressure;
  }

  public int getOxygenSaturation() {
    return oxygenSaturation;
  }

  public void setOxygenSaturation(int oxygenSaturation) {
    this.oxygenSaturation = oxygenSaturation;
  }

  public double getBodyTemperature() {
    return bodyTemperature;
  }

  public void setBodyTemperature(double bodyTemperature) {
    this.bodyTemperature = bodyTemperature;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }
}
