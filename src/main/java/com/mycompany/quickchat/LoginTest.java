/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_Lab
 */
    package com.mycompany.quickchat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoginTest {

    @Test
    public void testUserNameCorrect() {
        Login l = new Login();
        assertTrue(l.checkUserName("kyl_1")); // valid username
    }

    @Test
    public void testUserNameIncorrect() {
        Login l = new Login();
        assertFalse(l.checkUserName("kyle!!!!!!!")); // invalid username
    }

    @Test
    public void testPasswordCorrect() {
        Login l = new Login();
        assertTrue(l.checkPasswordComplexity("Ch&&sec@ke99!")); // valid password
    }

    @Test
    public void testPasswordIncorrect() {
        Login l = new Login();
        assertFalse(l.checkPasswordComplexity("password")); // invalid password
    }

    @Test
    public void testCellCorrect() {
        Login l = new Login();
        assertTrue(l.checkCellPhoneNumber("+27838968976")); // valid cell
    }

    @Test
    public void testCellIncorrect() {
        Login l = new Login();
        assertFalse(l.checkCellPhoneNumber("08966553")); // invalid cell
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

