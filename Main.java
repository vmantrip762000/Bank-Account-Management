package org.example;


import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int lastaccid = 0;
    private static ArrayList<Account> accounts;


    public static void main(String[] args) {

        int i = 0;
        accounts = new ArrayList<>();
        Database database = new Database();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Welcome to bank management System!");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            i = in.nextInt();
            switch(i){
                case 1:
                    new CreateAccount(in, lastaccid, accounts);
                    break;
                case 2:
                    new Login(in, accounts);
                    break;
            }

        } while (i != 3);
    }



}