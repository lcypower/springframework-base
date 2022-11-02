package com.example.springframework.exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private int code;
    private String message;
}
