package com.subsystems;

public class PaymentProcessor {
    public boolean processPayment(int customerId, double amount) {
        System.out.println("Processing of payment in the amount of $" + amount + " for customer " + customerId);
        return true;
    }

    public void refundPayment(int customerId, double amount) {
        System.out.println("Refund in the amount of $" + amount + " for customer " + customerId);
    }
}
