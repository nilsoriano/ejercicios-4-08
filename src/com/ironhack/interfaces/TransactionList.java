package com.ironhack.interfaces;
import com.ironhack.Transaction;
import java.util.ArrayList;
import java.util.Date;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction (Transaction transaction);
    Transaction getTransactionByDate(Date date);
    ArrayList<Transaction>  getAllTransactions();
}
