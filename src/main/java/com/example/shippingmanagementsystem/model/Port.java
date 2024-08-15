package com.example.shippingmanagementsystem.model;

public class Port {
    private String name;
    private String code;
    private String country;

    public Port(String name, String code, String country) {
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountry() {
        return country;
    }

   @Override
    public String toString() {
       return "Port{" +
               "name='" + name + '\'' +
               ", code='" + code + '\'' +
               ", country='" + country + '\'' +
               '}';
   }

}
