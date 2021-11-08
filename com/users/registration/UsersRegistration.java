package com.users.registration;

import java.util.Scanner;

public class UsersRegistration {

	public static void main(String[] args) {

		System.out.println("Enter 1 to validate and enter user details \nEnter 2 to validate email samples");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input == 1) {
			UserInput.userFirstName();
		}
		else if(input == 2) {
			SampleEmailValidation.testForValidEmails();
			SampleEmailValidation.testForNonValidEmails();
		}
		else {
			System.out.println("enter valid input");
		}	
	}	
}
