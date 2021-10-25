package com.hdjunction.hospitalmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity(name = "Patient")
public class Patient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 45)
    private String name = "";

    @Column(name = "serial_number", length = 13)
    private String serialNumber = "";

    @Column(name = "sex", length = 10)
    private String sex = "";

    @Column(name = "birth", length = 10)
    private String birth;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

}
