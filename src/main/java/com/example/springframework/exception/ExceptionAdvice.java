package com.example.springframework.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> customException(CustomException e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(e.getCode());
        errorResponse.setMessage(e.getMessage());

//        switch (e.getErrorNum()) {
//            case 401:
//                return ResponseEntity.status(401).body(errorResponse);
//            case 403:
//                return ResponseEntity.status(403).body(errorResponse);
//            case 404:
//                return ResponseEntity.status(404).body(errorResponse);
//            default:
//                return ResponseEntity.status(500).body(errorResponse);
//        }
        return ResponseEntity.status(500).body(errorResponse);
    }


}