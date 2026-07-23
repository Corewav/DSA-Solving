// Last updated: 7/23/2026, 9:35:39 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int profit = 0;
        for(int i = 1; i < n; i++) {
            if(prices[i] > prices[i-1])
            profit += (prices[i]- prices[i-1]);
        }
        return profit;
        
    }
}