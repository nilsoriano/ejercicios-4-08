package com.ironhack;

import java.time.LocalDate;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private double amount;
    private LocalDate date;

    public Transaction(int sellerAccountNumber, int buyerAccountNumber, double amount, LocalDate date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
