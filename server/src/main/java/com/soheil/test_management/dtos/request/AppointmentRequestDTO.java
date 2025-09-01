package com.soheil.test_management.dtos.request;

import java.time.Instant;

public class AppointmentRequestDTO {
    private long patientId;
    private long doctorId;
    private Instant date;
    private String status;
    private String note;
}
