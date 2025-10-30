package com.pluralsight;

public class Contract {

    private String date;
    private String name;
    private String email;
    private double price;
    private double monthyPayment;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMonthyPayment() {
        return monthyPayment;
    }

    public void setMonthyPayment(double monthyPayment) {
        this.monthyPayment = monthyPayment;
    }

    public Contract(String date, String name, String email, double price, double monthyPayment) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.price = price;
        this.monthyPayment = monthyPayment;


    }
}
