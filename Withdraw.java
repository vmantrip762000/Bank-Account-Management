package org.example;

import java.util.Scanner;

public class Withdraw {

    public Withdraw(Scanner in, Account acc) {

        System.out.println("Enter amount.");
        double amount = in.nextDouble();
        acc.setBalance(acc.getBalance() - amount);
        System.out.println("Operation performed successfully!");

    }

}