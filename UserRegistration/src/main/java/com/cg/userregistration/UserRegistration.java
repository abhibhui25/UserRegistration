package com.cg.userregistration;

import java.util.regex.*;
import java.util.*;

/**
 * @author Abhishek Bhui
 *
 */
class InvalidUserDetailsException extends Exception {
    public InvalidUserDetailsException() {
    }
}
public class UserRegistration {

    private static final String NAME_PATTERN="^[A-Z][aA-zZ]{2,}";
    private static final String EMAIL_PATTERN="^[A-Za-z0-9+]+([.][A-Za-z0-9]+)*" + "@([_A-Za-z0-9]?)+[.][_A-Za-z]{2,4}([.][A-Za-z]{2,})";
    private static final String MOBILE_PATTERN="^[0-9]{2}\\s[0-9]{10}$";

    /**
     * * UC1-Validate first name
     */
    public boolean firstNameCheck(String fname) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        try{
            if(pattern.matcher(fname).matches()){
                System.out.println("valid");
                return true;
            }
            throw new InvalidUserDetailsException();
        }
        catch(InvalidUserDetailsException e)
        {
            return false;
        }
    }

    /**
     * UC2-Validate last name
     */
    public boolean lastNameCheck(String lname) {
        Pattern pattern=Pattern.compile(NAME_PATTERN);
        try{
            if(pattern.matcher(lname).matches())
            {
                System.out.println("valid");
                return true;
            }
            throw new InvalidUserDetailsException();
        }
        catch(InvalidUserDetailsException e)
        {
            return false;
        }
    }

    /**
     * UC3-Validate email
     */
    public boolean emailCheck(String email) {
        Pattern pattern=Pattern.compile(EMAIL_PATTERN);
        try{
            if(pattern.matcher(email).matches())
            {
                System.out.println("valid");
                return true;
            }
            throw new InvalidUserDetailsException();
        }
         catch(InvalidUserDetailsException e)
        {
            return false;
        }
    }

    /**
     * UC4-Validate mobile number
     */
    public boolean mobileCheck(String mobile) {
        Pattern pattern=Pattern.compile(MOBILE_PATTERN);
        try{
            if(pattern.matcher(mobile).matches())
            {
                System.out.println("valid");
                return true;
            }
            throw new InvalidUserDetailsException();
        }
        catch(InvalidUserDetailsException e)
        {
            return false;
        }
    }

    /**
     * UC5,UC6,UC7,UC8,UC9-Validate password
     */
    public static boolean passwordCheck(String password) {
        try{
            if(Pattern.matches("[\\S]{8,}", password) && Pattern.matches(".*[A-Z].*", password)
                && Pattern.matches(".*[0-9].*", password) && Pattern.matches(".*[\\W]{1}.*", password))
            {
                System.out.println("valid");
                return true;
            }
            throw new InvalidUserDetailsException();
        }
        catch(InvalidUserDetailsException e)
        {
            return false;
        }
    }

    public static void main(String[] args) {
        UserRegistration user=new UserRegistration();
    }
}