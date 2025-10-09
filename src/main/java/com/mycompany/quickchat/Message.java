/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */

package com.mycompany.quickchat;

import java.util.Random;

/**
 *
 * @author RC_Student_Lab
 */
public final class Message {
    private final String messageID;   
    private final int messageNumber;  
    private final String recipient;   
    private final String text;        
    private final String messageHash; 

    
    public Message(int messageNumber, String recipient, String text) {
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.text = text;
        this.messageID = generateMessageID();
        this.messageHash = createMessageHash();
    }

   
    private String generateMessageID() {
        Random rnd = new Random();
        long num = 1000000000L + (long)(rnd.nextDouble() * 9000000000L);
        return Long.toString(num);
    }

    
    public boolean checkMessageID() {
        return messageID != null && messageID.length() == 10;
    }

    
    public boolean checkRecipientCell() {
        return recipient != null && recipient.matches("^\\+27\\d{9}$");
    }

    
    public String createMessageHash() {
        String idPrefix = messageID.substring(0, 2);
        String[] words = text.trim().split("\\s+");
        String first = words[0].replaceAll("[^A-Za-z0-9]", "");
        String last = words[words.length - 1].replaceAll("[^A-Za-z0-9]", "");
        return (idPrefix + ":" + messageNumber + ":" + first + last).toUpperCase();
    }

    
    public String sentMessageAction(String action) {
        return switch (action.toUpperCase()) {
            case "SEND" -> "Message successfully sent.";
            case "DISREGARD" -> "Press 0 to delete message.";
            case "STORE" -> "Message successfully stored.";
            default -> "Invalid action.";
        };
    }

    
    public String printMessageLine() {
        return messageID + ", " + messageHash + ", " + recipient + ", " + text;
    }

    
    public String getMessageID() {
        return messageID;
    }

    public String getMessageHash() {
        return messageHash;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }
}
