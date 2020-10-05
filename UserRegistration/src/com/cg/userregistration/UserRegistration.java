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

	/**
	 * UC3-Validate email
	 */
	public static boolean email() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = sc.next();
		boolean result = Pattern.matches(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9]+)*@" + "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",
				email);
		return result;
	}

	/**
	 * UC4-Validate mobile number
	 */
	public static boolean mobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String mobile = sc.next();
		if (Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile)) {
			System.out.println("valid");
			return true;
		} else {
			System.out.println("Invalid");
			return mobileNo();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		if (firstName())
			System.out.println("valid");
		else
			System.out.println("invalid");
		if (lastName())
			System.out.println("valid");
		else
			System.out.println("invalid");
		if (email())
			System.out.println("valid");
		else
			System.out.println("invalid");
		mobileNo();

	}
}
