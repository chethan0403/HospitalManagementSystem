package com.dcl.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String patientName;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String bloodGroup;
    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    
    @OneToOne
    @JoinColumn(name="details_id")
    private PatientDetails details;
}
