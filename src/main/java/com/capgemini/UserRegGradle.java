package com.capgemini;
import java.util.regex.*;
import java.util.*;

//Email ID uc5 check for optional closing part 2
public class UserRegGradle {

	public static String email;
	public static Scanner sc;
	public static void EmailCheck(String email) {
		boolean flag = true;
		while(flag) {
		Pattern p = Pattern.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]*(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			System.out.println("Email id is valid!!");
			flag = false;
			break;
		}
		else
		{
			System.out.println("Email id invalid!! Enter another mail id:");
			email=sc.nextLine();
			
		}
	}
		
	}
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		UserRegGradle user = new UserRegGradle();
		System.out.println("Enter the user email id:");
		email=sc.nextLine();
		user.EmailCheck(email);
  }
}

