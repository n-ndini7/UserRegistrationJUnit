package com.capgemini;

import java.util.Scanner;
import java.util.regex.*;

//JUnit tests to validate user entry 
public class UserRegGradle {
	public static Scanner sc;

	public boolean FirstNameCheck(String firstName) {
		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		return (firstName.matches(namePattern));
	}

	public boolean LastNameCheck(String lastName) {
		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		return (lastName.matches(namePattern));
	}

	public boolean EmailCheck(String email) {
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
		return (email.matches(emailPattern));
	}

	public boolean MobileCheck(String mobile) {
		String mobilePattern = "[0-9-]{1,}[ ][1-9]{1}[0-9]{9}";
		return (mobile.matches(mobilePattern));
	}

	public boolean PasswordCheck(String password) {
		String passwordPattern = "(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*\\W).{8,}$";
		return password.matches(passwordPattern);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradle user = new UserRegGradle();

		System.out.println("Welcome to user registration");

		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter Email ID");
		String email = sc.nextLine();
		System.out.println("Enter Mobile number");
		String mobile = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		// Inputs
		System.out.println("Valid first name: " + user.FirstNameCheck(firstName));
		System.out.println("Valid last name: " + user.LastNameCheck(lastName));
		System.out.println("Valid Email: " + user.EmailCheck(email));
		System.out.println("Valid Mobile number: " + user.MobileCheck(mobile));
		System.out.println("Valid password: " + user.PasswordCheck(password));
		// Patterns

	}

}
