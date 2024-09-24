package com.dbp.demopc1.patient.domain;

import com.dbp.demopc1.date.domain.Date;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String lastName;

    private String email;

    private Number pacientNumber;

    private LocalDate bornDate;

    private String storyNumber;

    @OneToMany
    private List<Date> dates;



}
