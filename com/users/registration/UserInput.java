package com.users.registration;

import java.util.Scanner;

public class UserInput {

	static Scanner sc = new Scanner(System.in);

	public static void userFirstName() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		ValidateUser.validateFirstName(firstName);
		userLastName();
	}

	public static void userLastName() {
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		ValidateUser.validateLastName(lastName);	
		userEmailId();
	}

	public static void userEmailId() {
		System.out.println("Enter Email Id");
		String emailId = sc.next();
		ValidateUser.validateEmailId(emailId);
		userPhoneNo();
	}
	
	public static void userPhoneNo() {
		System.out.println("Enter phone No ");
		String phoneNo = sc.next();
		ValidateUser.validatePhoneNo(phoneNo);
		userPassword();
	}
	
	public static void userPassword() {
		System.out.println("Enter password");
		String password = sc.next();
		ValidateUser.validatePassword(password);
	}
}
