package com.hdjunction.hospitalmanagement.repository;

import com.hdjunction.hospitalmanagement.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepository extends JpaRepository<Code, String> {
}
