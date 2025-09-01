package com.soheil.test_management.dtos.response;

import java.time.Instant;

public class ReportResponseDTO {
    private long id;
    private long testId;
    private String reportFilePath;
    private long doctorId;
    private Instant createdAt;
}
