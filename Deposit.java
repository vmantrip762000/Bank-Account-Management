package org.example;

import java.util.Scanner;

// Class responsible for handling deposit operations from a user's bank account
public class Deposit {

    public Deposit(Scanner in, Account acc){
        System.out.println("Enter amount.");
        double amount = in.nextDouble();
        acc.setBalance(acc.getBalance() +amount);//Deposit logic
        System.out.println("Operation performed successfully!");
    }
}
