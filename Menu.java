package org.example;

import java.util.Scanner;

public class Menu {

    public Menu(Scanner in, Account acc){

        int j=0;

        do {

            System.out.println("Welcome " + acc.getFirstName() + " " + acc.getLastName());

            System.out.println("1. Deposit \n2. Withdrawal\n3. Balance \n4. Exit");

            j = in.nextInt();
            switch (j) {
                case 1:
                    new Deposit(in, acc);
                    break;
                case 2:
                    new Withdraw(in, acc);
                    break;
                case 3:
                    System.out.println("Your balance is " + acc.getBalance());
                    break;

            }
        }while (j != 4);

    }

}
