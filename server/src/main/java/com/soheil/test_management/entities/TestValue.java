package com.soheil.test_management.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "test_values")
public class TestValue {
    @Id
    @Column(name = "test_value_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "test_id", nullable = false)
    private Test test;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "test_parameter_id", nullable = false)
    private TestParameter testParameter;

    @Column(name = "value", nullable = false)
    private Double value;

}