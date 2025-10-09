package com.mycompany.quickchat;

public class Message {
    private String messageID;
    private String messageHash;
    private String recipient;
    private String text;
    
    // Getters and Setters
    public String getMessageID() { return messageID; }
    public void setMessageID(String messageID) { this.messageID = messageID; }
    
    public String getMessageHash() { return messageHash; }
    public void setMessageHash(String messageHash) { this.messageHash = messageHash; }
    
    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }
    
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}