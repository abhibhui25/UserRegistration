package com.cg.userregistration;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.*;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailTest{
    final String emailTest;
    final boolean expectedResult;
    public static UserRegistration user;

    public EmailTest(String email,boolean expectedResult){
        this.emailTest=email;
        this.expectedResult=expectedResult;
    }

    @Before
    public void initialize() {
        user = new UserRegistration();
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@ VEmail.put(.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        Assert.assertEquals(this.expectedResult, expectedResult);
    }
}
