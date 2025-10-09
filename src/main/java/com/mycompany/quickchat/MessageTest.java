/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */

package com.mycompany.quickchat;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author RC_Student_Lab
 */
public class MessageTest {

    @Test
    public void testMessageIDLength() {
        Message m = new Message(0, "+27712345678", "Hello world");
        assertTrue(m.checkMessageID());
    }

    @Test
    public void testRecipientCellValid() {
        Message m = new Message(1, "+27831234567", "Test message");
        assertTrue(m.checkRecipientCell());
    }

    @Test
    public void testRecipientCellInvalid() {
        Message m = new Message(2, "0831234567", "Invalid phone number");
        assertFalse(m.checkRecipientCell());
    }

    @Test
    public void testMessageHashFormat() {
        Message m = new Message(3, "+27718693002", "Hi Mike thanks");
        String hash = m.getMessageHash();
        assertNotNull(hash);
        assertTrue(hash.matches("[0-9]{2}:\\d+:[A-Z0-9]+"));
    }

    @Test
    public void testSentMessageActionSend() {
        Message m = new Message(4, "+27831234567", "See you later");
        assertEquals("Message successfully sent.", m.sentMessageAction("SEND"));
    }

    @Test
    public void testSentMessageActionDisregard() {
        Message m = new Message(5, "+27831234567", "Bye");
        assertEquals("Press 0 to delete message.", m.sentMessageAction("DISREGARD"));
    }

    @Test
    public void testSentMessageActionStore() {
        Message m = new Message(6, "+27831234567", "Keep this");
        assertEquals("Message successfully stored.", m.sentMessageAction("STORE"));
    }
}
