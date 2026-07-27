class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = 999;

        for(int i = 0; i < prices.length; i++)
        {
            if(minPrice > prices[i])
            {
                minPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - minPrice);
        }

        return profit;
    }
}
