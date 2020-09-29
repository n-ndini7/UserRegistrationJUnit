package com.capgemini;

import java.util.regex.*;
import java.util.*;

//User registration passsword length check
public class UserRegGradle {

	public static Scanner sc;
	public static String pass;

	public void PassCheck(String pass) {

		Pattern p = Pattern.compile("[\\S]{8,}");
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

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradle user = new UserRegGradle();
		System.out.println("Enter password :");
		pass = sc.nextLine();
		user.PassCheck(pass);

	}
}
