package com.example.gtc.BLL.Model;

public class Transaction {

    private String date;
    private float grossRevenue;
    private float tax;

    public Transaction() {
    }

    public Transaction(String date, float grossRevenue, float tax) {
        this.date = date;
        this.grossRevenue = grossRevenue;
        this.tax = tax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getGrossRevenue() {
        return grossRevenue;
    }

    public void setGrossRevenue(float grossRevenue) {
        this.grossRevenue = grossRevenue;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
