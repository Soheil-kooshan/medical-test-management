package com.soheil.test_management.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "expected_ranges")
public class ExpectedRange {
    @Id
    @Column(name = "range_id", nullable = false)
    private Long id;

    @Column(name = "expected_min", nullable = false)
    private Double expectedMin;

    @Column(name = "expected_max", nullable = false)
    private Double expectedMax;

    @Column(name = "`condition`")
    private String condition;

}