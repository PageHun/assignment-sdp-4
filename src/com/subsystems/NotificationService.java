package com.subsystems;

public class NotificationService {
    public void sendOrderConfirmation(String email, int orderId) {
        System.out.println("Order confirmation called by order " + orderId + " for email " + email);
    }
}
