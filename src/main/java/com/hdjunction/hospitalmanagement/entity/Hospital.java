package com.hdjunction.hospitalmanagement.entity;


import lombok.Getter;

import javax.persistence.*;


@Getter
@Entity(name = "Hospital")
public class Hospital {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
	
}
