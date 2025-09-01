package com.soheil.test_management.dtos.response;

import java.time.Instant;

public class UserResponseDTO {
    private long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String imagePath;
    private String phoneNumber;
    private Boolean enabled;
    private Instant createdAt;
}
