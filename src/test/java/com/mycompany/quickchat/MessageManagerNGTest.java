/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.quickchat;

import java.util.List;
import static org.testng.Assert.*;

/**
 *
 * @author RC_Student_Lab
 */
public class MessageManagerNGTest {
    
    public MessageManagerNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of recordMessage method, of class MessageManager.
     */


    /**
     * Test of searchByID method, of class MessageManager.
     */


    /**
     * Test of searchByRecipient method, of class MessageManager.
     */
   

    /**
     * Test of longestMessage method, of class MessageManager.
     */


    /**
     * Test of deleteMessageByHash method, of class MessageManager.
     */
 

    /**
     * Test of displayReport method, of class MessageManager.
     */
  

    /**
     * Test of saveStoredMessagesToJson method, of class MessageManager.
     */
    
    /**
     * Test of loadStoredFromJson method, of class MessageManager.
     */


    /**
     * Test of getSentMessages method, of class MessageManager.
     */
    @org.testng.annotations.Test
    public void testGetSentMessages() {
        System.out.println("getSentMessages");
        MessageManager instance = new MessageManager();
        List expResult = null;
        List result = instance.getSentMessages();
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

    
    @org.testng.annotations.Test
    public void testGetStoredMessages() {
        System.out.println("getStoredMessages");
        MessageManager instance = new MessageManager();
        List expResult = null;
        List result = instance.getStoredMessages();
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

    
    @org.testng.annotations.Test
    public void testGetDisregardedMessages() {
        System.out.println("getDisregardedMessages");
        MessageManager instance = new MessageManager();
        List expResult = null;
        List result = instance.getDisregardedMessages();
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

        @org.testng.annotations.Test
    public void testDisplayAllSentMessages() {
        System.out.println("displayAllSentMessages");
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.displayAllSentMessages();
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

        @org.testng.annotations.Test
    public void testFindLongestMessage() {
        System.out.println("findLongestMessage");
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.findLongestMessage();
        assertEquals(result, expResult);
              fail("The test case is a prototype.");
    }

       @org.testng.annotations.Test
    public void testSearchMessageByID() {
        System.out.println("searchMessageByID");
        String searchID = "";
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.searchMessageByID(searchID);
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

    
    @org.testng.annotations.Test
    public void testSearchMessagesByRecipient() {
        System.out.println("searchMessagesByRecipient");
        String recipientNumber = "";
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.searchMessagesByRecipient(recipientNumber);
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

   
    @org.testng.annotations.Test
    public void testDeleteMessageByHashBoolean() {
        System.out.println("deleteMessageByHashBoolean");
        String hash = "";
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.deleteMessageByHash(hash);
        assertEquals(result, expResult);
        
        fail("The test case is a prototype.");
    }

    
    @org.testng.annotations.Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        MessageManager instance = new MessageManager();
        String expResult = "";
        String result = instance.displayFullReport();
        assertEquals(result, expResult);
       
        fail("The test case is a prototype.");
    }
    
}
