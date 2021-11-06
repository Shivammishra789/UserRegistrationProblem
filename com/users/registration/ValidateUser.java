package com.users.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {

	Scanner sc = new Scanner(System.in);

	public void userFirstName() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		validateFirstName(firstName);
		userLastName();
	}
	
	public void userLastName() {
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		validateLastName(lastName);	
	}

	public void validateFirstName(String firstName) {
		// regex pattern 
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		if(result == false) {
			System.out.println("Enter valid input! First name starts with Cap and has minimum 3 characters");
			userFirstName();
		}
	}

	public void validateLastName(String lastName) {
		// regex pattern 
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();
		if(result == false) {
			System.out.println("Enter valid input! Last name starts with Cap and has minimum 3 characters");
			userLastName();
		}
	}
}
