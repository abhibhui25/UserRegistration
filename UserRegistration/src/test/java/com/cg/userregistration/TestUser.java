package com.cg.userregistration;

import org.junit.*;
public class TestUser {
    UserRegistration user = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(user.firstNameCheck("Abhishek"));
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse()
    {
        Assert.assertFalse(user.firstNameCheck("ab"));
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(user.lastNameCheck("Bhui"));
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse()
    {
        Assert.assertFalse(user.lastNameCheck("bh"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(user.emailCheck("abc.xyz@bl.co.in"));
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse()
    {
        Assert.assertFalse(user.emailCheck(".xyz@bl"));
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(user.mobileCheck("91 7338425766"));
    }
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse()
    {
        Assert.assertFalse(user.mobileCheck("912 7338425766"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        Assert.assertTrue(user.passwordCheck("Abhi@bhui25"));
    }
    @Test
    public void givenPassword_IfNoCapital_ShouldReturnFalse()
    {
        Assert.assertFalse(user.passwordCheck("abhi@bhui"));
    }
    @Test
    public void givenPassword_IfNoNumber_ShouldReturnFalse()
    {
        Assert.assertFalse(user.passwordCheck("Abhi@bhui"));
    }
    @Test
    public void givenPassword_IfMoreThanOneSpecialCharacter_ShouldReturnFalse()
    {
        Assert.assertFalse(user.passwordCheck("abhi@25bhui#"));
    }
    @Test
    public void givenPassword_IfLessThan8Characters_ShouldReturnFalse()
    {
        Assert.assertFalse(user.passwordCheck("Ab@bhui"));
    }
}
