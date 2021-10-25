package com.hdjunction.hospitalmanagement.entity;

import javax.persistence.*;


@Entity(name = "Hospital")
public class Hospital {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 45)
    private String name = "";

    @Column(name = "healthcare_number", length = 20)
    private String healthcareNumber = "";

    @Column(name = "director_name", length = 10)
    private String directorName = "";
}
