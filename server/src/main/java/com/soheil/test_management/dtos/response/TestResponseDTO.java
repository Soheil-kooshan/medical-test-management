package com.soheil.test_management.dtos.response;

import java.time.Instant;
import java.time.LocalDate;

public class TestResponseDTO {
    private long id;
    private String testTemplateName;
    private String status;
    private LocalDate scanDate;
    private Instant createdAt;
    private Instant uploadedAt;

}
