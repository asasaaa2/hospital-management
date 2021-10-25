package com.hdjunction.hospitalmanagement.controller;

import com.hdjunction.hospitalmanagement.entity.Hospital;
import com.hdjunction.hospitalmanagement.entity.QHospital;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PatientController {
    private final JPAQueryFactory queryFactory;

    @GetMapping("/patient/{id}")
    public String get(@PathVariable("id")String id) {
        QHospital hospital = QHospital.hospital;
        Hospital hospital1 = queryFactory.selectFrom(hospital).fetchOne();
        System.out.println("hospital1 " + hospital1.getId());
        return "ok";
    }
}
