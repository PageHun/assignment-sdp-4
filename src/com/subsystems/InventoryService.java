package com.subsystems;

public class InventoryService {
    int quantity = 10;
    public boolean checkStock(int productId, int quantity) {
        if (quantity <= this.quantity) {
            System.out.println("Checking stock(productId): " + productId + ", quantity: " + quantity);
            return true;
        } else {
            System.out.println("There are only " + this.quantity + " products in stock instead of " + quantity);
            return false;
        }
    }

    public void reserveStock(int productId) {
        System.out.println("Product successfully reserved: " + productId);
    }

    public void releaseStock(int productId) {
        System.out.println("Product successfully released: " + productId);
    }
}
