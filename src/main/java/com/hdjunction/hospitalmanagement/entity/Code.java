package com.hdjunction.hospitalmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity(name = "Code")
public class Code {
	@Id
    @Column(name = "id", length = 10)
    private String id;

    @Column(name = "name", length = 10)
    private String name = "";

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code_group")
    private CodeGroup codeGroup;
}
