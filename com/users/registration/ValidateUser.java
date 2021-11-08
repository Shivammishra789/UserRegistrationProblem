package com.users.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {

	// validating firstname
	public static void validateFirstName(String firstName) {
		// regex pattern 
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();
		if(result == false) {
			System.out.println("Enter valid input! First name starts with Cap and has minimum 3 characters");
			UserInput.userFirstName();
		}
	}

	// validating lastname
	public static void validateLastName(String lastName) {
		// regex pattern 
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();
		if(result == false) {
			System.out.println("Enter valid input! Last name starts with Cap and has minimum 3 characters");
			UserInput.userLastName();
		}
	}
	
	// validating emailid
	public static void validateEmailId(String emailId) {
		// regex pattern 
		String regex = "^[a-zA-Z0-9]+([.][A-Za-z0-9]+)*@[a-z]+[.][a-zA-Z]{2,3}+([.][A-Za-z])?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
		boolean result = matcher.matches();
		if(result == false) {
			System.out.println("Enter valid EmailId!");
			UserInput.userEmailId();
		}
	}
}
