/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */


public class BuyAndSellStocks {

    public static void main(String args[]) {
        int [] prices = {7,1,5,3,6,4}; //{1,2,3,4,5} --- {7,6,4,3,1}
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int temp = 0;
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            temp = prices[i + 1] - prices[i];
            if (temp > 0) {
                sum = sum + temp;
            }
        }
        return sum;
    }
}