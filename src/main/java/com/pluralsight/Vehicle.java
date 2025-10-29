package com.pluralsight;

public class Vehicle {
 private String VIN;
 private static int year;
 private static String make;
 private static String model;
 private String VehicleType;
 private String Color;
 private int odometer;
 private double price;

    public Vehicle(String VIN, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.VIN = VIN;
        this.year = year;
        this.make = make;
        this.model = model;
        this.VehicleType = vehicleType;
        this.Color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public static String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static String getModel() {
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

    public record getOdometer() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", Color='" + Color + '\'' +
                ", odometer=" + odometer +
                ", price=" + price +
                '}';
    }
}


