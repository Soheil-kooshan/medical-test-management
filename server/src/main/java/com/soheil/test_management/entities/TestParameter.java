package com.soheil.test_management.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "test_parameters")
public class TestParameter {
    @Id
    @Column(name = "test_parameter_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "template_id", nullable = false)
    private TestTemplate template;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "unit", nullable = false, length = 50)
    private String unit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expected_range_id")
    private ExpectedRange expectedRange;

    @Column(name = "required", nullable = false)
    private Boolean required = false;

}