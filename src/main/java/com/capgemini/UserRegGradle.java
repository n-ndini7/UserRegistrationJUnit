package com.capgemini;

import java.util.Scanner;
import java.util.regex.*;

//Exception handling 
public class UserRegGradle {
	public static Scanner sc;

	public boolean FirstNameCheck(String firstName) throws UserRegistrationException {
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
		Matcher m = p.matcher(firstName);
		boolean flag = m.matches();
		if(!flag) 
			throw new UserRegistrationException ("Invalid entry of first name !! please re-try!");
			return flag;
	}

	public boolean LastNameCheck(String lastName) throws UserRegistrationException {
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z]{2,}");
		Matcher m = p.matcher(lastName);
		//return (lastName.matches(namePattern));
		boolean flag = m.matches();
		if(!flag) 
			throw new UserRegistrationException ("Invalid entry of last name!! please re-try!");
			return flag;
	}

	public boolean EmailCheck(String email)throws UserRegistrationException {
		Pattern p = Pattern.compile("^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$");
		Matcher m = p.matcher(email);
	//eturn (email.matches(emailPattern));
		boolean flag = m.matches();
		if(!flag) 
			throw new UserRegistrationException ("Invalid entry of Email ID!! please re-try!");
			return flag;
	}

	public boolean MobileCheck(String mobile)throws UserRegistrationException {
		Pattern p = Pattern.compile("[0-9]{2}[\\s][7-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		boolean flag = m.matches();
		if(!flag) 
			throw new UserRegistrationException ("Invalid entry of mobile no.!! please re-try!");
			return flag;
	}

	public boolean PasswordCheck(String pass )throws UserRegistrationException {
		Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher m = p.matcher(pass);
		boolean flag = m.matches();
		if(!flag) 
			throw new UserRegistrationException ("Invalid entry of Password!! please re-try!");
			return flag;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradle user = new UserRegGradle();

		System.out.println("Welcome to user registration");

	/*System.out.println("Please enter your first name:");
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
*/
	}

}
