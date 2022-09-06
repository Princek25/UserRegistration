package com.bridgelaz;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest extends TestCase {
    static UserRegistration userRegistration;
    @BeforeAll
    public static void initialize(){
        userRegistration =new UserRegistration();
    }
    @Test
    public void testUser_FirstName_becameTrue(){
        boolean result = userRegistration.firstNameValidate("Prince");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_LastName_becameTrue(){
        boolean result = userRegistration.lastNameValidate("Kumar");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_Email_BecameTrue(){
        boolean result = userRegistration.emailValidation("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_PhoneNumber_becameTrue(){
        boolean result = userRegistration.phoneValidation("919155222544");
        Assertions.assertTrue(result);
    }
    @Test
    public void testUser_password_BecameTrue(){
        boolean result = userRegistration.passwordValidation("A1@basas");
        Assertions.assertTrue(result);
    }

}