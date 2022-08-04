package com.ironhack;

import com.ironhack.interfaces.TransactionList;
import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList{
    private ArrayList<Transaction> transactionList;

    public PaymentList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Transaction getLastTransaction() {
        return null;
    }

    public void addTransaction(Transaction transaction) {

    }

    public Transaction getTransactionByDate(Date date) {
        for (Transaction t : transactionList) {
            if (t.getDate().equals(date)) {
                return t;
            }
        }
        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return null;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }
}
