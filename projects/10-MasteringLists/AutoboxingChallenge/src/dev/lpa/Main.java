package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("PKO");

        bank.addCustomer("Adam");
        bank.addCustomerTransaction("Adam", 100);
        bank.addCustomerTransaction("Adam", -25.5);

        bank.printTransaction("Adam");
    }
}
