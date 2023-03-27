import com.bridgelabz.SAM.Stock;
import com.bridgelabz.SAM.StockPortfolio;

import java.util.Scanner;

public class StockPortfolioManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio("", 0, 0);
        for (int i = 1; i <= numStocks; i++) {
            System.out.println("Enter details for stock #" + i + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number of shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Share price: ");
            double sharePrice = scanner.nextDouble();
            Stock stock = new Stock(name, numShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}