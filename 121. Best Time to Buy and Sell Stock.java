class Solution {
    public int maxProfit(int[] prices) {
        int stock = prices[0];
        int max_profit = 0;
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            stock = Math.min(stock,prices[i]);
            profit = prices[i] - stock;
            max_profit = Math.max(profit,max_profit);
        }
        return max_profit;
    }
}
