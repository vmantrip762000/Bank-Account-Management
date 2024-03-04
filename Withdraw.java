package org.example;

import java.util.Scanner;

// Class responsible for handling withdrawal operations from a user's bank account
public class Withdraw {

    public Withdraw(Scanner in, Account acc) {

        System.out.println("Enter amount.");
        double amount = in.nextDouble();
        acc.setBalance(acc.getBalance() - amount);// Withdrawal logic
        System.out.println("Operation performed successfully!");

    }

}
