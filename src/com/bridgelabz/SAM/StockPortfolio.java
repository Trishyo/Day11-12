package com.bridgelabz.SAM;

import java.util.ArrayList;

public class StockPortfolio extends Stock {
    private final ArrayList<Stock> stocks;

    public StockPortfolio(String name, int numShares, double sharePrice) {
        super(name, numShares, sharePrice);
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }
    public void printReport() {
        System.out.println("Stock Report");
        System.out.println("============");
        for (Stock stock : stocks) {
            System.out.println(stock.getName() + ": " + stock.getNumShares() + " shares, $" + stock.getSharePrice() + " per share, total value $" + stock.getValue());
        }
        System.out.println("============");
        System.out.println("Total value of all stocks: $" + getTotalValue());
    }
}

