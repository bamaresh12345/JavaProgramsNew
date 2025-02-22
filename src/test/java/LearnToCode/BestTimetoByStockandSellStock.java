package LearnToCode;

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
        //int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {7, 6, 4, 3, 1};

        System.out.println(bestTimetoByStockandSellStock(prices));
    }
}
