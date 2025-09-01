package com.soheil.test_management.dtos.response;

import java.time.Instant;

public class TestFileResponseDTO {
    private long id;
    private long testId;
    private String filePath;
    private String fileType;
    private Instant uploadedAt;
}
