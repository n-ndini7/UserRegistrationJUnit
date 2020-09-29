package com.capgemini;

import java.util.regex.*;
import java.util.*;

//User registration first name check
public class UserRegGradle {

	public static Scanner sc;
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

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradleuser = new UserRegGradle();
		System.out.println("Enter First name:");
		fname = sc.nextLine();
		user.FnameCheck(fname);

	}
}
