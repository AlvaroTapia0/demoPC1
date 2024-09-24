package com.dbp.demopc1.date.domain;


import com.dbp.demopc1.doctor.domain.Doctor;
import com.dbp.demopc1.patient.domain.Patient;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Date {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate appointmentDate;

    private LocalTime appointmentTime;

    private String codeDate;

    private String specialty;

    private Integer duration;

    @OneToOne
    private Patient patient;

    @OneToOne
    private Doctor doctor;

}
