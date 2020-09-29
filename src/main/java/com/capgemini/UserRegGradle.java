package com.capgemini;

import java.util.regex.*;
import java.util.*;

//User registration mobile no. check.
public class UserRegGradle {

	public static Scanner sc;
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
		System.out.println("Enter mobile no:");
		mobile = sc.nextLine();
		user.MobileCheck(mobile);

	}
}
