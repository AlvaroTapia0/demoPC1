package com.dbp.demopc1.doctor.domain;

import com.dbp.demopc1.date.domain.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String lastName;

    private String specialty;

    private String email;

    @OneToMany
    private List<Date> dates;
}
