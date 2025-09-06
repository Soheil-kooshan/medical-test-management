package com.soheil.test_management.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T>{
    private boolean success = true;
    private String message;
    private T data;
    private LocalDateTime timestamp = LocalDateTime.now();
}
