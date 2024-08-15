package com.example.shippingmanagementsystem.model;

public class Pallet {
    private String description;
    private int quantity;
    private double unitValue;
    private double totalWeight;
    private double totalSize;

    public Pallet(String description, int quantity, double unitValue, double totalWeight, double totalSize) {
        this.description = description;
        this.quantity = quantity;
        this.unitValue = unitValue;
        this.totalWeight = totalWeight;
        this.totalSize = totalSize;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalSize() {
        return totalSize;
    }

    public double getTotalValue() {
        return unitValue * quantity;
    }

  @Override
    public String toString() {
        return "Pallet{" +
                "description='" + description + '\'' +
                ", quantity=" + quantity +
                ", unitValue=" + unitValue +
                ", totalWeight=" + totalWeight +
                ", totalSize=" + totalSize +
                '}';
    }
}
