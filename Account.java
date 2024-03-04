package org.example;

// Class representing a bank account with essential attributes and methods

public class Account {
    private String firstName;
    private String lastName;
    private int accid;// Account ID
    private double balance;// Account balance
    private int passcode;// Passcode

    public Account(){}



    public Account(String firstName, String lastName, int accid, double balance, int passcode){

        super(); // Call to superclass constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.accid = accid;
        this.balance = balance;
        this.passcode = passcode;

    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
