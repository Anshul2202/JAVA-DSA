// 121 - Best Time to Buy and Sell Stock

class Solution121 {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int currentProfit = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){

            currentProfit = prices[i] - buy;

            if(currentProfit > profit) profit = currentProfit;

            if(prices[i] < buy) buy = prices[i];
        }

        return profit;
        
    }
}