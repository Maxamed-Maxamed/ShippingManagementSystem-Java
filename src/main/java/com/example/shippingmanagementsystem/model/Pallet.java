package com.example.shippingmanagementsystem.model;


public class Pallet {
    private String description;
    private int quantity;
    private double unitValue;
    private double totalWeight;
    private double totalSize; // Size in cubic feet

    public Pallet(String description, int quantity, double unitValue, double totalWeight, double totalSize) {
        this.description = description;
        this.quantity = quantity;
        this.unitValue = unitValue;
        this.totalWeight = totalWeight;
        this.totalSize = totalSize;
    }

    // Getters and Setters
    // toString method


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }


    public double getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(double totalSize) {
        this.totalSize = totalSize;
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
