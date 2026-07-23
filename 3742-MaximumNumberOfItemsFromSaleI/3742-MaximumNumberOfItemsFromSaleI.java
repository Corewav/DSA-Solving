// Last updated: 7/23/2026, 9:32:09 AM
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int MAX = 1500;
        int[] freq = new int[MAX +1];
        for(int[] item : items){
            freq[item[0]]++;
        }
        int[] bonus = new int[n];
        for(int i =0; i<n;i++){
            int f = items[i][0];
            for(int multiple = f; multiple <= MAX; multiple += f){
                bonus[i] += freq[multiple];
            }
            bonus[i]--;
        }
        int[] dp =new int[budget +1];
        for(int i =0;i<n;i++){
            int price  = items[i][1];
            int firstValue =1 + bonus[i];
            for(int b = budget; b >= price; b--){
                dp[b] =Math.max(dp[b],dp[b - price] + firstValue);
            }
            for(int b = price; b <= budget; b++){
                dp[b] = Math.max(dp[b], dp[b-price] +1);
            }
        }
        int ans =0;
        for(int x : dp) ans = Math.max(ans,x);
        return ans;
    }
}