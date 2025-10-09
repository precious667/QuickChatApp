/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_Lab
 */
    package com.mycompany.quickchat;

import java.util.Random;

public final class Message {
    private final String messageID;   // 10-digit string
    private final int messageNumber;  // 0-based index
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
        long min = 1000000000L;
        long num = min + (long)(rnd.nextDouble() * 9000000000L);
        return Long.toString(num);
    }

    public boolean checkMessageID() {
        return messageID != null && messageID.length() <= 10;
    }

    public boolean checkRecipientCell() {
        // reuse the same SA phone regex as login
        return recipient != null && recipient.matches("^\\+27\\d{9}$");
    }

    public String createMessageHash() {
        String id = messageID;
        String firstTwo = id.substring(0, Math.min(2, id.length()));
        String firstWord = "";
        String lastWord = "";
        String[] words = text.trim().split("\\s+");
        if (words.length > 0) {
            firstWord = words[0].replaceAll("[^A-Za-z0-9]", "");
            lastWord = words[words.length - 1].replaceAll("[^A-Za-z0-9]", "");
        }
        return (firstTwo + ":" + messageNumber + ":" + (firstWord + lastWord)).toUpperCase();
    }

    public String sentMessageAction(String action) {
        // action = "SEND", "DISREGARD", "STORE"
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

    // getters
    public String getMessageID() { return messageID; }
    public String getMessageHash() { return messageHash; }
    public String getRecipient() { return recipient; }
    public String getText() { return text; }
}


