package LeetCode150Questions;
/*
121. Best Time to Buy and Sell Stock Easy
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different
day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit,
return 0.

Example 1: Input: prices = [7,1,5,3,6,4] Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2: Input: prices = [7,6,4,3,1] Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
        */

public class BestTimetoByStockandSellStock {

    /*
      1. declare buy_price = price[0]
      2. currProfit =0 and max profit=0
      3. run for loop with next day i=1
      4. check if(price[i] < buy_price)
      5. then swap the buy_price to price[i]
      6. else
      7. currProfit = price[i] - buy_price
      8. get maxProfit = Math.max(crrProfit, maxProfit)
      9. after the end of for loop
      10 . return maxProfit
     */
    public static int bestTimetoByStockandSellStock(int[] prices) {
        int buy_price = prices[0];
        int currProfit = 0, maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                currProfit = prices[i] - buy_price;
                maxProfit = Math.max(currProfit, maxProfit);
            }
        }
        return maxProfit;


    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        //int[] prices = {7, 6, 4, 3, 1};

        System.out.println(bestTimetoByStockandSellStock(prices));
        // System.out.println(bestTimetoByStockandSellStockBruteForce(prices)); // will not work
    }

    // brute force will not work for this
//    public static int bestTimetoByStockandSellStockBruteForce(int[] prices) {
//      /*  int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = 0; j < prices.length; j++) {
//                int currProfit = prices[i] - prices[j];
//                maxProfit = Math.max(currProfit, maxProfit);
//            }
//        }*/
//

    // return maxProfit;
    // }

}
