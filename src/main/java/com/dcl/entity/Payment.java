package com.dcl.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private String payment;
    private Double amount;
    private String paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    private String transactionId;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}