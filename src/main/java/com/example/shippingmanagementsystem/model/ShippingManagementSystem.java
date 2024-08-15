package com.example.shippingmanagementsystem.model;

import java.util.ArrayList;
import java.util.List;



public class ShippingManagementSystem {
    private LinkedList<Port> ports;
    private LinkedList<ContainerShip> ships;
    private LinkedList<Container> containers;
    private LinkedList<Pallet> pallets;

    public ShippingManagementSystem() {
        ports = new LinkedList<>();
        ships = new LinkedList<>();
        containers = new LinkedList<>();
        pallets = new LinkedList<>();
    }

    public void addPort(String name, String code, String country) {
        ports.add(new Port(name, code, country));
    }

    public void addContainerShip(String name, String identifier, String flagState, String photoURL) {
        ships.add(new ContainerShip(name, identifier, flagState, photoURL));
    }

    public void addContainer(String number, int size) {
        containers.add(new Container(number, size));
    }

    public void addPallet(String description, int quantity, double unitValue, double totalWeight, double totalSize) {
        pallets.add(new Pallet(description, quantity, unitValue, totalWeight, totalSize));
    }

    public LinkedList<Port> getPorts() {
        return ports;
    }

    public LinkedList<ContainerShip> getShips() {
        return ships;
    }

    public LinkedList<Container> getContainers() {
        return containers;
    }

    public LinkedList<Pallet> getPallets() {
        return pallets;
    }
}
