package org.example;


import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Main class for the bank management system
    static Scanner in = new Scanner(System.in);
    public static int lastaccid = 0;

    // Initialize the ArrayList to store accounts
    private static ArrayList<Account> accounts;


    public static void main(String[] args) {

        int i = 0;
        accounts = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Welcome to bank management System!");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            i = in.nextInt();

            // Use a switch statement to perform actions based on user input
            switch(i){
                case 1:
                    //create a new account using the CreateAccount class
                    new CreateAccount(in, lastaccid, accounts);
                    break;
                case 2:
                    //If the user selects 2, login using the Login class
                    new Login(in, accounts);
                    break;
            }

        } while (i != 3);// Continue the loop until the user selects 3 to exit
    }



}