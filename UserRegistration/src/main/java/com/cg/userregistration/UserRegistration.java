package com.cg.userregistration;

import java.lang.reflect.Modifier;
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
        checkIfValid checkfname = f_name -> Pattern.matches(NAME_PATTERN,f_name);
        try{
            if(checkfname.check(fname)){
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
        checkIfValid checklname = l_name -> Pattern.matches(NAME_PATTERN,l_name);
        try{
            if(checklname.check(lname))
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
        checkIfValid checkemail = emailNew -> Pattern.matches(EMAIL_PATTERN,emailNew);
        try{
            if(checkemail.check(email))
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
        checkIfValid checkmobile = mob -> Pattern.matches(MOBILE_PATTERN,mob);
        try{
            if(checkmobile.check(mobile))
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
        checkIfValid checkpassword=pwd -> (Pattern.matches("[\\S]{8,}", pwd) && Pattern.matches(".*[A-Z].*", pwd)
                && Pattern.matches(".*[0-9].*", pwd) && Pattern.matches(".*[\\W]{1}.*", pwd));
        try{
            if(checkpassword.check(password))
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
@FunctionalInterface
interface checkIfValid {
    boolean check(String str);
}