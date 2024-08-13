package com.example.shippingmanagementsystem.model;

public class Container {

    private String containerNumber;
    private int size; // Size in feet (10, 20, 40)
    private CustomLinkedList<Pallet> pallets;

    public Container(String containerNumber, int size) {
        this.containerNumber = containerNumber;
        this.size = size;
        this.pallets = new CustomLinkedList<>();
    }

    // Getters and Setters
    // toString method
    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CustomLinkedList<Pallet> getPallets() {
        return pallets;
    }

    public void setPallets(CustomLinkedList<Pallet> pallets) {
        this.pallets = pallets;
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerNumber='" + containerNumber + '\'' +
                ", size=" + size +
                ", pallets=" + pallets +
                '}';
    }
}