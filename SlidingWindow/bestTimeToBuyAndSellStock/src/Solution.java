public class Solution {
    /**
     * Function that calculates the best time to buy and sell stocks.
     * @param prices<Integer> - an array of integers, where prices[i] can range from [0, 10001]
     * @return integer - the maximum profit that can achieve from a transaction. If no profit can be achieved, then return 0.
     */
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int buy = 0;
        int sell = 1;
        int maxProfit = 0;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            } else {
                buy = sell;
            }
            sell++;
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}