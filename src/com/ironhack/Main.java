package com.ironhack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("Little Bobby Tables" , "Outside your validation functions", 1, 250000.00);
        Account acc2 = new Account("Robert C. Martin", "Clean Codeland", 2, 300000.00);

        Transaction t1 = new Transaction(acc1.getAccountNumber(), acc2.getAccountNumber(), 20, LocalDate.now());
        Transaction t2 = new Transaction(acc2.getAccountNumber(), acc1.getAccountNumber(), 30, LocalDate.now());

        ArrayList<Transaction> al1 = new ArrayList<>();
        al1.add(t1);
        al1.add(t2);
        PaymentList pl1 = new PaymentList(al1);

        Transaction t3 = new Transaction(acc1.getAccountNumber(), acc2.getAccountNumber(), 5, LocalDate.now());
        pl1.addTransaction(t3);
    }
}