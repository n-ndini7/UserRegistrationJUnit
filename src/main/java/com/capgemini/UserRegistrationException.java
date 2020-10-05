package com.capgemini;

public class UserRegistrationException extends Exception {
	// custom exception class for invalid user entry
	enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_MOBILE, INVALID_PASSWORD;
	}

	ExceptionType type;

	public UserRegistrationException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
