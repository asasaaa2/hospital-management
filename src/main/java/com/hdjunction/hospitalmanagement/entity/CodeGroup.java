package com.hdjunction.hospitalmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity(name = "CodeGroup")
public class CodeGroup {
	@Id
    @Column(name = "id", length = 10)
    private String id;

    @Column(name = "name", length = 10)
    private String name = "";

    @Column(name = "desc", length = 10)
    private String desc = "";

    @OneToMany(mappedBy = "codeGroup")
    private List<Code> codeGroups;
}
