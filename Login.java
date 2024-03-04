package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public Login(Scanner in, ArrayList<Account> accounts) {

        // Prompt user to enter account id and passcode

        System.out.println("Enter account id.");
        int id = in.nextInt();
        System.out.println("Enter passcode.");
        int passcode = in.nextInt();

        // Create an empty Account object to store the user's account details
        Account account = new Account();

        boolean exist = false;
        for (Account acc : accounts) {

            // Check if the entered account ID and passcode match any existing account
            if (acc.getAccid() == id && acc.getPasscode() == passcode) {
                exist = true;
                account = acc;
            }

            // If an account with the entered credentials is found, open the main menu using the Menu class
            if (exist) {
                new Menu(in, account);
            } else {
                System.out.println("Account doesn't exist");
            }
        }
    }
}
