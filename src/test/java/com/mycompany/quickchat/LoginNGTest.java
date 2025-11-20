package com.mycompany.quickchat;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginNGTest {

    @Test
    public void testUserNameCorrect() {
        Login l;
        l = new Login();
        assertTrue(l.checkUserName("kyl_1"));
    }

    @Test
    public void testUserNameIncorrect() {
        Login l = new Login();
        assertFalse(l.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testPasswordCorrect() {
        Login l = new Login();
        assertTrue(l.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordIncorrect() {
        Login l = new Login();
        assertFalse(l.checkPasswordComplexity("password"));
    }

    @Test
    public void testCellCorrect() {
        Login l = new Login();
        assertTrue(l.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testCellIncorrect() {
        Login l = new Login();
        assertFalse(l.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testRegisterAndLogin() {
        Login l = new Login();
        
        String regMsg = l.registerUser("John", "Doe", "jo_d", "Abc@1234", "+27831234567");
        assertTrue(regMsg.contains("successfully")); 
        
        assertTrue(l.loginUser("jo_d", "Abc@1234"));
        
        String expected = "Welcome John ,Doe it is great to see you.";
        assertEquals(expected, l.returnLoginStatus("jo_d", "Abc@1234"));
    }
}