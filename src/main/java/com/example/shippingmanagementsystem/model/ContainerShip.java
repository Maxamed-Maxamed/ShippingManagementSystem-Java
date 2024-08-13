package com.example.shippingmanagementsystem.model;

import java.awt.*;
import java.util.*;
import java.util.stream.*;


public class ContainerShip {
    private String shipName;
    private String shipIdentifier;
    private String flagState;
    private String photoURL;
    private CustomLinkedList<Container> containers;
    private Port currentPort;

    public ContainerShip(String shipName, String shipIdentifier, String flagState, String photoURL) {
        this.shipName = shipName;
        this.shipIdentifier = shipIdentifier;
        this.flagState = flagState;
        this.photoURL = photoURL;
        this.containers = new CustomLinkedList<>();
        this.currentPort = null; // Default to null (at sea)
    }

    // Getters and Setters
    // toString method


    public String getShipName() {
        return shipName;
    }


    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipIdentifier() {
        return shipIdentifier;
    }

    public void setShipIdentifier(String shipIdentifier) {
        this.shipIdentifier = shipIdentifier;
    }

    public String getFlagState() {
        return flagState;
    }

    public void setFlagState(String flagState) {
        this.flagState = flagState;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public CustomLinkedList<Container> getContainers() {
        return containers;
    }

    public void setContainers(CustomLinkedList<Container> containers) {
        this.containers = containers;
    }

    public Port getCurrentPort() {
        return currentPort;
    }

    public void setCurrentPort(Port currentPort) {
        this.currentPort = currentPort;
    }

    @Override
    public String toString() {
        return "ContainerShip{" +
                "shipName='" + shipName + '\'' +
                ", shipIdentifier='" + shipIdentifier + '\'' +
                ", flagState='" + flagState + '\'' +
                ", photoURL='" + photoURL + '\'' +
                ", containers=" + containers +
                ", currentPort=" + currentPort +
                '}';
    }
}
