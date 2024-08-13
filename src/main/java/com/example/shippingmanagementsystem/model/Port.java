package com.example.shippingmanagementsystem.model;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Port {

    private String portName;
    private String internationalPortCode;
    private String country;

    private CustomLinkedList<Container> containers;

    public Port(String portName, String internationalPortCode, String country) {
        this.portName = portName;
        this.internationalPortCode = internationalPortCode;
        this.country = country;
        this.containers = new CustomLinkedList<>();
    }


    //getter and setter
    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getInternationalPortCode() {
        return internationalPortCode;
    }

    public void setInternationalPortCode(String internationalPortCode) {
        this.internationalPortCode = internationalPortCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CustomLinkedList<Container> getContainers() {
        return containers;
    }

    public void setContainers(CustomLinkedList<Container> containers) {
        this.containers = containers;
    }

    @Override
    public String toString() {
        return "Port{" +
                "portName='" + portName + '\'' +
                ", internationalPortCode='" + internationalPortCode + '\'' +
                ", country='" + country + '\'' +
                ", containers=" + containers +
                '}';
    }




}
