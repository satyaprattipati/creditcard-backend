package com.creditcard.exception;

public class AdminNotFoundException extends RuntimeException {
	public AdminNotFoundException(String message) {
		super(message);
	}
	public AdminNotFoundException() {
		
	}
}