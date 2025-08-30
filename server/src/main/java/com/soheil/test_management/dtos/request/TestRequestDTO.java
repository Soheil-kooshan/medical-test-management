package com.soheil.test_management.dtos.request;

import java.time.LocalDate;

public class TestRequestDTO {
    private long patientId;
    private long testTemplateId;
    private String status;
    private LocalDate scanDate;
    private String note;

}
