package com.example.springframework.exception;


import lombok.Getter;

public class CustomException extends RuntimeException {
    @Getter
    private int code;
    @Getter
    private String message;

    public CustomException(Errors e) {
        this.code = e.getCode();
        this.message = e.getMessage();
    }

    public CustomException(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
