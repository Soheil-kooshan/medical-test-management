package com.soheil.test_management.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 30)
    private String lastName;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = false;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ManyToMany(mappedBy = "roles")
    private Set<Role> roles = new HashSet<>();
}