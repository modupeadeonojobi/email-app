package com.company.imodupsy;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "fairy.com";
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is  "  + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + this.companySuffix;
    }

    private String setDepartment() {
        System.out.println("New worker: " + firstName  + " Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter department code: ");
        Scanner keyboard = new Scanner(System.in);
        int deptChoice = keyboard.nextInt();
        if (deptChoice == 1) { return " Sales"; }
        else if (deptChoice == 2) { return "Dev"; }
        else if (deptChoice == 3) { return "Accounting"; }
        else { return " "; }
    }

    public String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()0987654321";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getDefaultPasswordLength() {
        return defaultPasswordLength;
    }

    public String showInfo() {
        return "Display name: " + firstName + lastName +
                "\nCompany email: " + email +
                "\nMailbox capacity: " + mailBoxCapacity;
    }
}
