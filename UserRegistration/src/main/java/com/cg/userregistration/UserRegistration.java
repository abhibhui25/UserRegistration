package com.cg.userregistration;

import java.util.regex.*;
import java.util.*;

/**
 * @author Abhishek Bhui
 *
 */

public class UserRegistration {

    private static final String NAME_PATTERN="^[A-Z][aA-zZ]{2,}";
    private static final String EMAIL_PATTERN="^[A-Za-z0-9+]+([.][A-Za-z0-9]+)*" + "@([_A-Za-z0-9]?)+[.][_A-Za-z]{2,4}([.][A-Za-z]{2,})";
    private static final String MOBILE_PATTERN="^[0-9]{2}\\s[0-9]{10}$";

    /**
     * * UC1-Validate first name
     */
    public boolean firstNameCheck(String fname) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    /**
     * UC2-Validate last name
     */
    public boolean lastNameCheck(String lname) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    /**
     * UC3-Validate email
     */
    public boolean emailCheck(String email) {
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    /**
     * UC4-Validate mobile number
     */
    public boolean mobileCheck(String mobile) {
        Pattern pattern=Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobile).matches();
    }

    /**
     * UC5,UC6,UC7,UC8,UC9-Validate password
     */
    public static boolean passwordCheck(String password) {

        return (Pattern.matches("[\\S]{8,}", password) && Pattern.matches(".*[A-Z].*", password)
                && Pattern.matches(".*[0-9].*", password) && Pattern.matches(".*[\\W]{1}.*", password));
    }
}