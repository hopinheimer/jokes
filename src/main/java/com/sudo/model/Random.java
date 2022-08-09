package com.sudo.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "random")
public class Random {

    @Id
    @Column(name ="candidate_id")
    private Long candidateId;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

}
