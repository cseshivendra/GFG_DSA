package Array;
//Leetcode 121 - Best time to Buy and sell the stocks
public class StocksBuySell {

    public int maxProfit(int[] prices){
        int minSoFar = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minSoFar;
            if (profit > ans){
                ans = profit;
            }
            minSoFar = Math.min(prices[i], minSoFar);
        }
        return ans;
    }
}
