package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {
	@Test
	public void givenAllDetails_WhenAllProper_ShouldReturnTrue() {
		try {
			boolean isValid = UserRegGradle.validate("Nandini", "Gupta", "rng@123.com", "91 9876543210", "Abc@1234t");
			assertEquals(true, isValid);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenAllDetails_WhenFirstNameImproper_ShouldThrowCustomException_ofTypeInvalidFirstName() {
		try {
			UserRegGradle.validate("N@ndini", "Gupta", "rng@123.com", "91 9876543210", "Abc@1234t");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
		}
	}

	@Test
	public void givenAllDetails_WhenLastNameImproper_ShouldThrowCustomException_ofTypeInvalidLastName() {
		try {
			UserRegGradle.validate("Nandini", "Gu", "rng@123.com", "91 9876543210", "Abc@1234t");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
		}
	}

	@Test
	public void givenAllDetails_WhenEmailImproper_ShouldThrowCustomException_ofTypeInvalidEmail() {
		try {
			UserRegGradle.validate("Nandini", "Gupta", "rng@", "91 9876543210", "Abc@1234t");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.type);
		}
	}

	@Test
	public void givenAllDetails_WhenMobileImproper_ShouldThrowCustomException_ofTypeInvalidMobile() {
		try {
			UserRegGradle.validate("Nandini", "Gupta", "rng@gmail.com", "91 98765", "Abc@1234t");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE, e.type);
		}
	}

	@Test
	public void givenAllDetails_WhenPasswordImproper_ShouldThrowCustomException_ofTypeInvalidPassword() {
		try {
			UserRegGradle.validate("Nandini", "Gupta", "rng@gmail.com", "91 9876543210", "Abc");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
		}
	}

	// Tests for password

}
