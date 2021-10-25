package com.hdjunction.hospitalmanagement.repository;

import com.hdjunction.hospitalmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
