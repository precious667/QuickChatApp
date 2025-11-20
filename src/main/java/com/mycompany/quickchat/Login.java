
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_Lab
 */
package com.mycompany.quickchat;

public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellNumber;

    public Login() {}

        public boolean checkUserName(String username) {
        if (username == null) return false;
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password == null) return false;
                String regex = "^(?=.{8,}$)(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).*$";
        return password.matches(regex);
    }

    public boolean checkCellPhoneNumber(String cell) {
        if (cell == null) return false;
        
        return cell.matches("^\\+27\\d{9}$");
    }

    
    public String registerUser(String firstName, String lastName, String username, String password, String cellNumber) {

        this.firstName = firstName;
        this.lastName = lastName;

        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
        }

        
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
        return "Username successfully captured.\nPassword successfully captured.\nCell number successfully captured.";
    }

    // login
    public boolean loginUser(String username, String password) {
        if (this.username == null || this.password == null) return false;
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            
            return "Welcome " + (firstName == null ? "" : firstName) + " ," + (lastName == null ? "" : lastName) + " it is great to see you.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    
    public String getUsername() { return username; }
    public String getCellNumber() { return cellNumber; }
}

    


