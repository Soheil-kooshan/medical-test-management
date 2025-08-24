package com.soheil.test_management.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "test_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "test_template_id", nullable = false)
    private TestTemplate testTemplate;

    @Column(name = "status", nullable = false, length = 20)
    private String status;

    @Column(name = "scan_date")
    private LocalDate scanDate;

    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "uploaded_at", nullable = false)
    private Instant uploadedAt;

}