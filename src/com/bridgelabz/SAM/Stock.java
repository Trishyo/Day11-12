package com.bridgelabz.SAM;

public class Stock {
    private String name;
    private int numShares;
    private double sharePrice;

    public Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public String getName() {
        return name;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getValue() {
        return numShares * sharePrice;
    }
}

