package Array;

public class StockBuySell {
    // Method to calculate maximum profitStock Buy and Sell Problem (Part 1)
    int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // No prices means no profit
        }

        int maxProfit = 0;
        int minSoFar = prices[0];

        for (int i = 1; i < prices.length; i++) { // Start from index 1
            // Update the minimum price so far
            minSoFar = Math.min(minSoFar, prices[i]);
            // Calculate profit if sold at current price
            int profit = prices[i] - minSoFar;
            // Update maximum profit if the current profit is greater
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {5, 2, 6, 1, 4};
        StockBuySell obj = new StockBuySell();
        int profit = obj.maxProfit(prices); // Call the maxProfit method
        System.out.println("Maximum Profit: " + profit); // Print the result
    }
}