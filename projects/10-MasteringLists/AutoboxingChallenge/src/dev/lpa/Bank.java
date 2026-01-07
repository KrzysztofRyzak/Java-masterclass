package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) != null) {
            return false;
        }
        customers.add(new Customer(customerName));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(amount);
        return true;
    }

    private Customer findCustomer(String name) {

        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public void printTransaction(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Transactions:");

        for (Double transactions : customer.getTransactions()) {
            double amount = transactions;
            System.out.println(" " + amount);
        }
    }
}
