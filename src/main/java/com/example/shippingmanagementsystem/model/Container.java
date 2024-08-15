package com.example.shippingmanagementsystem.model;

public class Container {

    private String number;
    private int size;

    public Container(String number, int size) {
        if (size != 10 && size != 20 && size != 40) {
            throw new IllegalArgumentException("Invalid container size");
        }
        this.number = number;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return size * 64;
    }

    @Override
    public String toString() {
        return "Container{" +
                "number='" + number + '\'' +
                ", size=" + size +
                '}';
    }
}
