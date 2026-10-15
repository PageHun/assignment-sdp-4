package com.facade;

import com.subsystems.InventoryService;
import com.subsystems.NotificationService;
import com.subsystems.PaymentProcessor;
import com.subsystems.ShippingService;

public class OrderFacade {
    private final InventoryService inventoryService;
    private final NotificationService notificationService;
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;

    public OrderFacade(){
        this.inventoryService = new InventoryService();
        this.notificationService = new NotificationService();
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(int orderId, int quantity, double amount, int customerId, String address, String email){
        System.out.println("====== Ordering system ======");

        boolean paymentSuccess = paymentProcessor.processPayment(orderId, amount, quantity);
        if(!paymentSuccess){
            System.out.println("Order is rejected");
            System.out.println("=============================");
        } else {
            if(!inventoryService.checkStock(orderId, quantity)){
                System.out.println("Order could not be placed");
            } else{
                inventoryService.reserveStock(orderId);
            }

            try{
                int trackingNumber = shippingService.arrangeShipping(orderId, address);
                notificationService.sendOrderConfirmation(email, trackingNumber);
                System.out.println("Shipping service successfully done. Tracking number " + trackingNumber);
                System.out.println("=============================");
            } catch (Exception e){
                System.out.println("Occurred error!");
                paymentProcessor.refundPayment(orderId, amount);
                inventoryService.releaseStock(orderId);
            }
        }
    }
}
