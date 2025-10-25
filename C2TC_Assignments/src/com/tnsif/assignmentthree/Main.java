package com.tnsif.assignmentthree;

public class Main {
    public static void Main(String[] args) {
        // Create accounts
        savingsaccount savings = new savingsaccount("Sathish", 5000);
        checkingaccount checking = new checkingaccount("Kumar", 3000);

        // Create a Transaction object
        transaction t = new transaction();

        // Perform transactions
        t.performTransaction(savings, "deposit", 1000);
        t.performTransaction(checking, "withdraw", 500);

        // Display total accounts
        System.out.println("Total Bank Accounts: " + bank.getTotalAccounts());
    }
}