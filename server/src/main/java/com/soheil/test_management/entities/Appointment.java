package com.soheil.test_management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @Column(name = "appointment_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User doctorId;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "note")
    private String note;

    @Column(name = "uploaded_at", nullable = false)
    private Instant uploadedAt;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

}