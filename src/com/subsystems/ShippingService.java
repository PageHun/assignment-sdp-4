package com.subsystems;

public class ShippingService {
    public int arrangeShipping(int customerId, String address) {
        System.out.println("Shipping service called for customer " + customerId + " with address " + address);
        int trackingNumber = customerId;
        return trackingNumber;
    }
}
