package com.soheil.test_management.dtos.response;

import java.time.Instant;

public class AppointmentResponseDTO {
    private long id;
    private long patientId;
    private long doctorId;
    private Instant date;
    private String status;
    private String note;
    private Instant uploadedAt;
    private Instant createdAt;
}
