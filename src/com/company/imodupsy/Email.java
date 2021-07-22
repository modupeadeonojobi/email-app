package com.company.imodupsy;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companySuffix = "fairy.com";
    private int defaultPasswordLength = 10;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created for " + this.firstName + this.lastName );

        this.department = setDepartment();
        System.out.println("Department " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is  "  + this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + this.companySuffix;
        System.out.println(this.email);
    }

    private String setDepartment() {
        System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter department code: ");
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
}
