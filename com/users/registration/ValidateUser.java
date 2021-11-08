package com.users.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {

	static String regex;
	static Pattern pattern;
	static Matcher matcher;

	//method for validation of user first name using regex
	public static void validateFirstName(String firstName) {
		// regex pattern 
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(firstName);
		if(matcher.matches()) {
			System.out.println("Enter valid input! First name starts with Cap and has minimum 3 characters");
			UserInput.userFirstName();
		}
	}

	//method for validation of user last name using regex
	public static void validateLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(lastName);
		if(matcher.matches()) {
			System.out.println("Enter valid input! Last name starts with Cap and has minimum 3 characters");
			UserInput.userLastName();
		}
	}

	//method for validation of user emailId using regex
	public static void validateEmailId(String emailId) { 
		regex = "^[a-zA-Z0-9]+([.][A-Za-z0-9]+)*@[a-z]+[.][a-zA-Z]{2,3}+([.][A-Za-z])?$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(emailId);
		if(matcher.matches()) {
			System.out.println("Enter valid EmailId!");
			UserInput.userEmailId();
		}
	}

	//method for validation of user phone number using regex
	public static void validatePhoneNo(String phoneNo) {
		regex = "^[0-9]{1,2}-[0-9]{10}$";
		pattern  = Pattern.compile(regex);
		matcher = pattern.matcher(phoneNo);
		if(matcher.matches()) {
			System.out.println("Enter valid phone number!");
			UserInput.userPhoneNo();
		}
	}

	//method for validation of user password using regex
	public static void validatePassword(String password) {
		regex = "^[a-zA-Z](?=.*[A-Z]).{8,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("Enter valid password");
			UserInput.userPassword();
		}
	}
}
