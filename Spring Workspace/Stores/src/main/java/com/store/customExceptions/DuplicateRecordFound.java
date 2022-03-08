package com.store.customExceptions;

public class DuplicateRecordFound extends RuntimeException{

	public DuplicateRecordFound(String message) {
		super(message);
	}
	
}
