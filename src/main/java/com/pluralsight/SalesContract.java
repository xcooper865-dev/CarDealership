package com.pluralsight;

public class SalesContract extends Contract{
    private double salesTaxAmount;
    private double recordingFee = 100;
    private double processingFee;
    private boolean wantToFinance;

    public SalesContract(String date, String name, String email,Vehicle vehicleSold, boolean wantToFinance) {
        super(date, name, email,vehicleSold);

        this.wantToFinance = wantToFinance;
        //calculate sales tax 5%of the Vehicle's price
        this.salesTaxAmount = vehicleSold.getPrice()*0.05;


        if(vehicleSold.getPrice()<10000){
            this.processingFee = 295;

        }else{
            this.processingFee = 495;
        }

    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public boolean isWantToFinance() {
        return wantToFinance;
    }

    public void setWantToFinance(boolean wantToFinance) {
        this.wantToFinance = wantToFinance;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }


    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice()+ salesTaxAmount+recordingFee+processingFee;
    }

    @Override
    public double geMonthlyPrice() {
        if (!wantToFinance) {
            return 0;
        }
        int numberOfPayments;
        double interestrate;

        if (getVehicleSold().getPrice() > 10000) {
            numberOfPayments = 48;
            interestrate = 4.25/ 100/ 12;


        }else {
            numberOfPayments = 24;
            interestrate = 5.25/ 100/ 12;

        }
        double loanAmount = getTotalPrice();
        double monthlyPayment = loanAmount *(interestrate* Math.pow(1+interestrate,numberOfPayments))
                / (Math.pow(1+ interestrate,numberOfPayments)-1);

        return monthlyPayment;
    }
    }

