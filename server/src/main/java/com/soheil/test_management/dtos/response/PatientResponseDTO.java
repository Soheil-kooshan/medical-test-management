package com.soheil.test_management.dtos.response;

import java.time.Instant;
import java.time.LocalDate;

public class PatientResponseDTO {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String nationalCode;
    private String imagePath;
    private String phoneNumber;
    private Instant createdAt;
}
