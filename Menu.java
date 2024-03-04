package org.example;

import java.util.Scanner;

public class Menu {

    // Class responsible for displaying and handling the main menu for user interactions

    // Constructor for the Menu class
    // Takes a Scanner for user input and an Account object for the user's account details
    public Menu(Scanner in, Account acc){

        int j=0;

        // Start a loop to display the main menu and handle user input
        do {

            System.out.println("Welcome " + acc.getFirstName() + " " + acc.getLastName());

            System.out.println("1. Deposit \n2. Withdrawal\n3. Balance \n4. Exit");

            j = in.nextInt();
            switch (j) {
                case 1:
                    new Deposit(in, acc);//Deposit class is called
                    break;
                case 2:
                    new Withdraw(in, acc);//Withdrawal class is called
                    break;
                case 3:
                    System.out.println("Your balance is " + acc.getBalance());//Balance is displayed
                    break;

            }
        }while (j != 4);//Loop break statement

    }

}
