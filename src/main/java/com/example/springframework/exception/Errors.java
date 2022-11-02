package com.example.springframework.exception;

public enum Errors {
    BAD_REQUEST(400, "Bad Request."),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error.");

    private final int code;
    private final String message;

    Errors(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
