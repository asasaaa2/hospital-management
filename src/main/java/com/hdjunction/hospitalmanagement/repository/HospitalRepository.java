package com.hdjunction.hospitalmanagement.repository;

import com.hdjunction.hospitalmanagement.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
