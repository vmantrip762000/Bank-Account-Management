package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccount {

    public CreateAccount(Scanner in, int lastaccid, ArrayList<Account> accounts) {

        System.out.println("Enter first name.");
        String firstName = in.next();
        System.out.println("Enter last name.");
        String lastName = in.next();
        System.out.println("Enter balance.");
        double balance = in.nextDouble();
        System.out.println("Enter passcode. (digits only!) ");
        int passcode = in.nextInt();
        System.out.println("Confirm passcode.");
        int passcodec = in.nextInt();
        if (passcode != passcodec) {
            System.out.println("Passcodes not matching.");
            return;
        }
        int id = 1000000 + lastaccid;
        lastaccid += 1;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        System.out.println("Your account id " + id);
        new Menu(in, acc);


    }


}
