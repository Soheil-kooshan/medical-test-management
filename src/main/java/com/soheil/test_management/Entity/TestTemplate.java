package com.soheil.test_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "test_templates")
public class TestTemplate {
    @Id
    @Column(name = "test_template_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "description", length = 555)
    private String description;

    @Column(name = "radiotracer", nullable = false, length = 50)
    private String radiotracer;

    @Column(name = "protocol", length = 555)
    private String protocol;

}