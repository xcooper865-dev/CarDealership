package com.pluralsight;

public class LeaseContract extends Contract{

    private double ExpectedEndValue;
    private double leaseFee;

    public LeaseContract(String date, String name, String email, Vehicle vehicleSold, double expectedEndValue, double leaseFee) {
        super(date, name, email, vehicleSold);
       this.ExpectedEndValue = vehicleSold.getPrice()*0.50;
        this.leaseFee = vehicleSold.getPrice()*0.07;

    }

    public double getExpectedEndValue() {
        return ExpectedEndValue;
    }

    public void setExpectedEndValue(double expectedEndValue) {
        this.ExpectedEndValue = expectedEndValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        return (getVehicleSold().getPrice()-ExpectedEndValue)+leaseFee;
    }

    @Override
    public double geMonthlyPrice() {
        int numberOfPayments = 36;
        double interestRate = 4.0/ 100/ 12;
        double loanAmount = getTotalPrice();
        double monthlyPayment = loanAmount*(interestRate*Math.pow(1+interestRate,numberOfPayments))
                /(Math.pow(1+interestRate,numberOfPayments)-1);
        return monthlyPayment;
    }
}
