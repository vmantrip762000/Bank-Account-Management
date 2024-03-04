package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public Login(Scanner in, ArrayList<Account> accounts) {

        System.out.println("Enter account id.");
        int id = in.nextInt();
        System.out.println("Enter passcode.");
        int passcode = in.nextInt();

        Account account = new Account();

        boolean exist = false;
        for (Account acc : accounts) {

            if (acc.getAccid() == id && acc.getPasscode() == passcode) {
                exist = true;
                account = acc;
            }

            if (exist) {
                new Menu(in, account);
            } else {
                System.out.println("Account doesn't exist");
            }
        }
    }
}
