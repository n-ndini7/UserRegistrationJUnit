package com.capgemini;

public class UserRegistrationException extends Exception {
	// custom exception class for invalid user entry
	public UserRegistrationException(String message) {
		super(message);
	}
}
