package com.cg.userregistration;

import java.util.regex.*;
import java.util.*;

/**
 * @author Abhishek Bhui
 *
 */

public class UserRegistration {
	/**
	 * * UC1-Validate first name
	 */
	public static boolean firstName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String first = sc.next();
		boolean result = Pattern.matches("^[A-Z][aA-zZ]{2,}", first);
		return result;
	}

	/**
	 * UC2-Validate last name
	 */
	public static boolean lastName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name: ");
		String last = sc.next();
		boolean result = Pattern.matches("^[A-Z][aA-zZ]{2,}", last);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		if(firstName())
			System.out.println("valid");
		else
			System.out.println("invalid");
		if(lastName())
			System.out.println("valid");
		else
			System.out.println("invalid");
				
	}
}
