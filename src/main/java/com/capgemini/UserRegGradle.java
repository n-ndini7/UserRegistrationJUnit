package com.capgemini;

import java.util.regex.*;
import java.util.*;

//User registration UC9 - email samples
public class UserRegGradle {

	public static Scanner sc;
	public static String pass;

	public void PassCheck(String pass) {

		Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher m = p.matcher(pass);
		boolean flag = true;
		while (flag) {
			if (m.matches()) {
				System.out.println("Entered password is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Entered password is invalid!! ");
				break;
			}
		}
	}

	public static String fname;

	public void FnameCheck(String fname) {

		Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		Matcher m = p.matcher(fname);
		boolean flag = true;
		while (flag) {
			if (m.matches()) {
				System.out.println("Entered First name is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Entered first name is invalid!! ");
				break;
			}
		}
	}

	public static String lname;

	public void LnameCheck(String lname) {

		Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{2,}");
		Matcher m = p.matcher(lname);
		boolean flag = true;
		while (flag) {
			if (m.matches()) {
				System.out.println("Entered last name is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Entered last name is invalid!! ");
				break;
			}
		}
	}

	public static String email;

	public void EmailCheck(String email) {
		boolean flag = true;
		while (flag) {
			Pattern p = Pattern
					.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
			Matcher m = p.matcher(email);
			if (m.matches()) {
				System.out.println("Email id is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Email id invalid!! Enter another mail id:");
				email = sc.nextLine();

			}
		}

	}

	public static String mobile;

	public void MobileCheck(String mobile) {

		Pattern p = Pattern.compile("[0-9]{2}[\\s][7-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		boolean flag = true;
		while (flag) {
			if (m.matches()) {
				System.out.println("Entered mobile no. is valid!!");
				flag = false;
				break;
			} else {
				System.out.println("Entered mobile no. is invalid!! Re-enter mobile no.:");
				mobile = sc.nextLine();
				flag = true;
			}
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
	UserRegGradle user = new UserRegGradle();
		// first name check
		System.out.println("Enter First name:");
		fname = sc.nextLine();
		user.FnameCheck(fname);
		// last name check
		System.out.println("Enter Last name:");
		lname = sc.nextLine();
		user.FnameCheck(lname);
		// email check
		System.out.println("Enter the user email id:");
		email = sc.nextLine();
		user.EmailCheck(email);
		// mobile no. check
		System.out.println("Enter mobile no:");
		mobile = sc.nextLine();
		user.MobileCheck(mobile);
		// password check
		System.out.println("Enter password :");
		pass = sc.nextLine();
		user.PassCheck(pass);
		System.out.println("Thankyou!!!");

	}
}
