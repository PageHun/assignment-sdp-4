package com.subsystems;

public class PaymentProcessor {
    int balance = 1000;
    public boolean processPayment(int customerId, double amount, int quantity) {
        if (balance >= (amount * quantity)) {
            balance -= amount * quantity;
            System.out.println("Processing of payment in the amount of $" + amount + " for customer " + customerId);
            return true;
        } else  {
            System.out.println("Not enough balance for customer " + customerId);
            return false;
        }
    }

    public void refundPayment(int customerId, double amount) {
        System.out.println("Refund in the amount of $" + amount + " for customer " + customerId);
    }
}
