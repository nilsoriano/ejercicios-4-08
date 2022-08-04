package com.ironhack;

public class Account {
    private String name;
    private String address;
    private int accountNumber;
    private double balance;

    public Account(String name, String address, int accountNumber, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
