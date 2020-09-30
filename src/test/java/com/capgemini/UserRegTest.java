package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.FirstNameCheck("Nandini");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.FirstNameCheck("Nan");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WhenNotCaps_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {

			boolean result = user.FirstNameCheck("nandini");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WhenSpecialChar_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {

			boolean result = user.FirstNameCheck("Nandini@@");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}
	// Tests for first name

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.LastNameCheck("Gupta");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.LastNameCheck("Gup");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenNotCaps_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.LastNameCheck("gupta");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenSpecialChar_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.LastNameCheck("Gupta@@");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}
	// Tests for last name

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.MobileCheck("91 8312345567");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenMobileNumber_WhenCodeMoreThanTwoDigits_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.MobileCheck("124 8312345567");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenMobileNumber_WhenHasAnyNonNumeric_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();

		try {
			boolean result = user.MobileCheck("91 831234@567");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenMobileNumber_WhenNotTenDigits_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();

		try {
			boolean result = user.MobileCheck("91 83123455");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}
	// Tests for mobile number

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();

		try {
			boolean result = user.EmailCheck("abc@yahoo.com");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenEmail_ProperSecondLevelDomain_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.EmailCheck("abc.100@abc.com.au");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenEmail_InvalidTLD_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.EmailCheck("abc@123.c");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenEmail_HavingMultipleTLD_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.EmailCheck("abc@gmail.com.aa.in");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}
	// Tests for Email ID

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.PasswordCheck("aBcd123@m");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenProperCase2_ShouldReturnTrue() {
		UserRegGradle user = new UserRegGradle();

		try {
			boolean result = user.PasswordCheck("@ABC12345");
			assertEquals(true, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.PasswordCheck("ball@1234");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse() {
		UserRegGradle user = new UserRegGradle();
		try {
			boolean result = user.PasswordCheck("Apple98765");
			assertEquals(false, result);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Invalid entry!! please re-try!", e.getMessage());
		}
	}
	// Tests for password

}
