package com.capgemini;

import java.util.regex.*;
import java.util.*;

//User registration last  name check
public class UserRegGradle {

	public static Scanner sc;
	public static String lname;

	public void FnameCheck(String fname) {

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

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradle user = new UserRegGradle();
		System.out.println("Enter Last name:");
		lname = sc.nextLine();
		user.FnameCheck(lname);

	}
}
