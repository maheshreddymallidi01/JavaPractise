package com.practise.LeetCode;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[] prices = {7,1,5,6,3,4};
		System.out.println(maxProfit(prices));
	}

	private static int maxProfit(int[] prices) {
        int profit = 0;
        int mini = prices[0];
        int sell = 0;
        for(int i=0;i<prices.length;i++){
            sell = prices[i]-mini;
            profit = Math.max(profit,sell);
            mini = Math.min(mini,prices[i]);
        }
        return profit;
    }

}
