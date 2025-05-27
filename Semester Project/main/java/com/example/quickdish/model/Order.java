package com.example.quickdish.model;

import java.util.List;

public class Order {
    private int orderId;
    private List<CartItem> items;
    private double totalAmount;

    public Order(int orderId, List<CartItem> items, double totalAmount) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() { return orderId; }
    public List<CartItem> getItems() { return items; }
    public double getTotalAmount() { return totalAmount; }

    public void setOrderId(int orderId) { this.orderId = orderId; }
    public void setItems(List<CartItem> items) { this.items = items; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
