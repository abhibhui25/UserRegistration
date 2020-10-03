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

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		System.out.println(firstName());
	}
}
