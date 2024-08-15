package com.example.shippingmanagementsystem.model;

public class ContainerShip {

    private String name;
    private String identifier;
    private String flagState;
    private String photoURL;

    public ContainerShip(String name, String identifier, String flagState, String photoURL) {
        this.name = name;
        this.identifier = identifier;
        this.flagState = flagState;
        this.photoURL = photoURL;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getFlagState() {
        return flagState;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    @Override
    public String toString() {
        return "ContainerShip{" +
                "name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", flagState='" + flagState + '\'' +
                ", photoURL='" + photoURL + '\'' +
                '}';
    }

}
