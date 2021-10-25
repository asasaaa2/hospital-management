package com.hdjunction.hospitalmanagement.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Visit")
public class Visit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Patient_id")
    private Patient patient;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "status", length = 10)
    private String status;
}
