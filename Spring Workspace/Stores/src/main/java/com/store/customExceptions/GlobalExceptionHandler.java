package com.store.customExceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
	   
	@ExceptionHandler(InvalidRecord.class)
	public ResponseEntity<?> customValidationErrorHandling(InvalidRecord exception){
		ErrorDetails errorDetails = new ErrorDetails("invalid gst");
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
}