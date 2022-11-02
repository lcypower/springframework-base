package com.example.springframework.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice
public class BaseExceptionAdvice {
	@ExceptionHandler({SQLException.class, NullPointerException.class, MissingPathVariableException.class})
	public ResponseEntity<Object> baseException() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(Errors.INTERNAL_SERVER_ERROR.getCode());
		errorResponse.setMessage(Errors.INTERNAL_SERVER_ERROR.getMessage());
		return ResponseEntity.status(500).body(errorResponse);
	}
}

