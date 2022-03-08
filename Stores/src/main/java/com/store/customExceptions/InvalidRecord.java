package com.store.customExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class InvalidRecord extends RuntimeException {
	
	String error ;

	public InvalidRecord(String arg0) {
		super();
		this.error = arg0;
	}   
}
