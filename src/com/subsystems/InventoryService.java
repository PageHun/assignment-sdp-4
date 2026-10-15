package com.subsystems;

public class InventoryService {
    public boolean checkStock(int productId, int quantity) {
        System.out.println("Checking stock: " + productId + ", quantity: " + quantity);
        return true;
    }

    public void reserveStock(int productId) {
        System.out.println("Product successfully reserved: " + productId);
    }

    public void releaseStock(int productId) {
        System.out.println("Product successfully released: " + productId);
    }
}
