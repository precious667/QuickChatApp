package com.mycompany.quickchat;

import javax.swing.JOptionPane;

public class QuickChat {
    private static MessageManager messageManager = new MessageManager();
    
    public static void main(String[] args) {
        // Add test data for Part 3
        addTestData();
        
        // Show main menu
        showMainMenu();
    }
    
    private static void addTestData() {
        // Test message 1
        Message msg1 = new Message();
        msg1.setMessageID("MSG001");
        msg1.setMessageHash("HASH001");
        msg1.setRecipient("+27831234567");
        msg1.setText("Hello, this is test message 1");
        messageManager.addTestMessage(msg1, "SEND");
        
        // Test message 2
        Message msg2 = new Message();
        msg2.setMessageID("MSG002");
        msg2.setMessageHash("HASH002");
        msg2.setRecipient("+27837654321");
        msg2.setText("This is a longer test message for testing the longest message feature");
        messageManager.addTestMessage(msg2, "SEND");
        
        // Test message 3
        Message msg3 = new Message();
        msg3.setMessageID("MSG003");
        msg3.setMessageHash("HASH003");
        msg3.setRecipient("+27831234567");
        msg3.setText("Another message for the same recipient");
        messageManager.addTestMessage(msg3, "SEND");
        
        // Add some stored and disregarded messages
        Message msg4 = new Message();
        msg4.setMessageID("MSG004");
        msg4.setMessageHash("HASH004");
        msg4.setRecipient("+27839876543");
        msg4.setText("This message is stored for later");
        messageManager.addTestMessage(msg4, "STORE");
        
        Message msg5 = new Message();
        msg5.setMessageID("MSG005");
        msg5.setMessageHash("HASH005");
        msg5.setRecipient("+27839123456");
        msg5.setText("This message was disregarded");
        messageManager.addTestMessage(msg5, "DISREGARD");
    }
    
    private static void showMainMenu() {
        while (true) {
            String choice = JOptionPane.showInputDialog(
                "=== QUICKCHAT APPLICATION ===\n" +
                "1. Part 1 - Registration & Login\n" +
                "2. Part 2 - Send Messages\n" + 
                "3. Part 3 - Message Management & Reports\n" +
                "4. Exit"
            );
            
            if (choice == null || choice.equals("4")) {
                JOptionPane.showMessageDialog(null, "Thank you for using QuickChat!");
                System.exit(0);
            }
            
            switch (choice) {
                case "1":
                    showPart1Menu();
                    break;
                case "2":
                    showPart2Menu();
                    break;
                case "3":
                    showPart3Menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please enter 1-4.");
            }
        }
    }
    
    private static void showPart3Menu() {
        while (true) {
            String choice = JOptionPane.showInputDialog(
                "=== PART 3 FEATURES ===\n" +
                "1. Display All Sent Messages\n" +
                "2. Find Longest Message\n" +
                "3. Search Message by ID\n" +
                "4. Search Messages by Recipient\n" +
                "5. Delete Message by Hash\n" +
                "6. Display Full Report\n" +
                "7. Back to Main Menu"
            );
            
            if (choice == null || choice.equals("7")) break;
                
            switch (choice) {
                case "1":
                    JOptionPane.showMessageDialog(null, messageManager.displayAllSentMessages());
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, messageManager.findLongestMessage());
                    break;
                case "3":
                    String searchID = JOptionPane.showInputDialog("Enter Message ID to search (try MSG001, MSG002, MSG003):");
                    if (searchID != null && !searchID.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, messageManager.searchMessageByID(searchID));
                    }
                    break;
                case "4":
                    String recipient = JOptionPane.showInputDialog("Enter recipient number (try +27831234567):");
                    if (recipient != null && !recipient.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, messageManager.searchMessagesByRecipient(recipient));
                    }
                    break;
                case "5":
                    String hash = JOptionPane.showInputDialog("Enter message hash to delete (try HASH001):");
                    if (hash != null && !hash.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, messageManager.deleteMessageByHash(hash));
                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, messageManager.displayFullReport());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please enter 1-7.");
            }
        }
    }
    
    private static void showPart1Menu() {
        JOptionPane.showMessageDialog(null, "Part 1 - Registration & Login features would go here");
        // You would implement your actual Part 1 login features here
    }
    
    private static void showPart2Menu() {
        JOptionPane.showMessageDialog(null, "Part 2 - Send Messages features would go here");
        // You would implement your actual Part 2 message sending features here
    }
}