package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName,
                               double initialTransactions) {

        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialTransactions);
    }

    public boolean addCustomerTransaction(String branchName, String customerName,
                                          double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String branchName) {
        for (var branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());

        int customerIndex = 1;
        for (Customer customer : branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + customerIndex + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                int txIndex = 1;
                for (Double transaction : customer.getTransactions()) {
                    double amount = transaction; // unboxing
                    System.out.println("[" + txIndex + "] Amount " + amount);
                    txIndex++;
                }
            }
            customerIndex++;
        }
        return true;

    }
}
