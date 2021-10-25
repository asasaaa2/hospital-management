package com.hdjunction.hospitalmanagement.repository;

import com.hdjunction.hospitalmanagement.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
