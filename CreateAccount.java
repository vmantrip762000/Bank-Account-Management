package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {

    // Constructor for CreateAccount class
    // Takes Scanner for user input, last account ID, and a list of existing accounts

    public CreateAccount(Scanner in, int lastaccid, ArrayList<Account> accounts) {

        System.out.println("Enter first name.");
        String firstName = in.next();
        System.out.println("Enter last name.");
        String lastName = in.next();
        System.out.println("Enter balance.");
        double balance = in.nextDouble();

        // First name, Last Name and Balance are collected in above commands

        System.out.println("Enter passcode. (digits only!) ");
        int passcode = in.nextInt();
        System.out.println("Confirm passcode.");
        int passcodec = in.nextInt();

        //Password confirmation and verification
        if (passcode != passcodec) {
            System.out.println("Passcodes not matching.");
            return;
        }

        // Generate a unique account ID based on the last account ID
        int id = 1000000 + lastaccid;
        lastaccid += 1;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        System.out.println("Your account id " + id);

        // Open the main menu for the newly created account using the Menu class
        new Menu(in, acc);


    }


}
