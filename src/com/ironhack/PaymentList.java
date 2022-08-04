package com.ironhack;

import com.ironhack.interfaces.TransactionList;
import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList{
    private ArrayList<Transaction> transactionArrayList;

    public Transaction getLastTransaction() {
        return null;
    }

    public void addTransaction(Transaction transaction) {

    }

    public Transaction getTransactionByDate(Date date) {
        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return null;
    }
}
