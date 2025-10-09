package com.mycompany.quickchat;

import java.util.ArrayList;
import java.util.List;

public class MessageManager {
    private List<Message> sentMessages = new ArrayList<>();
    private List<Message> storedMessages = new ArrayList<>();
    private List<Message> disregardedMessages = new ArrayList<>();
    
    // Part 3 Methods - SIMPLE VERSION
    public String displayAllSentMessages() {
        if (sentMessages.isEmpty()) {
            return "No sent messages found.";
        }
        
        StringBuilder result = new StringBuilder("All Sent Messages:\n");
        for (int i = 0; i < sentMessages.size(); i++) {
            Message m = sentMessages.get(i);
            result.append(i + 1).append(". To: ").append(m.getRecipient())
                  .append(" | Message: ").append(m.getText()).append("\n");
        }
        return result.toString();
    }
    
    public String findLongestMessage() {
        if (sentMessages.isEmpty()) {
            return "No sent messages available.";
        }
        
        Message longest = sentMessages.get(0);
        for (Message m : sentMessages) {
            if (m.getText().length() > longest.getText().length()) {
                longest = m;
            }
        }
        return "Longest Message: " + longest.getText();
    }
    
    public String searchMessageByID(String searchID) {
        for (Message m : sentMessages) {
            if (m.getMessageID().equals(searchID)) {
                return "Message Found - ID: " + searchID + " | Message: " + m.getText();
            }
        }
        return "Message with ID '" + searchID + "' not found.";
    }
    
    public String searchMessagesByRecipient(String recipientNumber) {
        List<Message> results = new ArrayList<>();
        for (Message m : sentMessages) {
            if (m.getRecipient().equals(recipientNumber)) {
                results.add(m);
            }
        }
        
        if (results.isEmpty()) {
            return "No messages found for recipient: " + recipientNumber;
        }
        
        StringBuilder result = new StringBuilder("Messages for " + recipientNumber + ":\n");
        for (Message m : results) {
            result.append("- ").append(m.getText()).append("\n");
        }
        return result.toString();
    }
    
    public String deleteMessageByHash(String messageHash) {
        for (int i = 0; i < sentMessages.size(); i++) {
            if (sentMessages.get(i).getMessageHash().equals(messageHash)) {
                sentMessages.remove(i);
                return "Message with hash '" + messageHash + "' successfully deleted.";
            }
        }
        return "Message with hash '" + messageHash + "' not found.";
    }
    
    public String displayFullReport() {
        if (sentMessages.isEmpty()) {
            return "No messages to report.";
        }
        
        StringBuilder report = new StringBuilder("FULL MESSAGE REPORT\n");
        report.append("==================\n");
        for (int i = 0; i < sentMessages.size(); i++) {
            Message m = sentMessages.get(i);
            report.append("Message ").append(i + 1).append(":\n");
            report.append("  ID: ").append(m.getMessageID()).append("\n");
            report.append("  Hash: ").append(m.getMessageHash()).append("\n");
            report.append("  Recipient: ").append(m.getRecipient()).append("\n");
            report.append("  Message: ").append(m.getText()).append("\n\n");
        }
        report.append("Total Sent Messages: ").append(sentMessages.size());
        return report.toString();
    }
    
    // Method to add test data
    public void addTestMessage(Message msg, String type) {
        if ("SEND".equals(type)) {
            sentMessages.add(msg);
        } else if ("STORE".equals(type)) {
            storedMessages.add(msg);
        } else if ("DISREGARD".equals(type)) {
            disregardedMessages.add(msg);
        }
    }
    
    // Getters for testing
    public List<Message> getSentMessages() { return sentMessages; }
    public List<Message> getStoredMessages() { return storedMessages; }
    public List<Message> getDisregardedMessages() { return disregardedMessages; }
}