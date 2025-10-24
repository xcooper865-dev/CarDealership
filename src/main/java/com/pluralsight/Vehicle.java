package com.pluralsight;

public class Vehicle {
 private int VIN;
 private int year;
 private String make;
 private String model;
 private String VehicleType;
 private String Color;
 private int odometer;
 private double price;

    public Vehicle(int VIN, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.VIN = VIN;
        this.year = year;
        this.make = make;
        this.model = model;
        VehicleType = vehicleType;
        Color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

