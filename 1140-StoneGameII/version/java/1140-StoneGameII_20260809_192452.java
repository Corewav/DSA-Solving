// Last updated: 8/9/2026, 7:24:52 PM
1class Solution {
2    public int stoneGameII(int[] piles) {
3        int n = piles.length;
4        int[][] dp = new int[n][n+1];
5        int[] suffixSum = new int[n];
6        suffixSum[n-1] = piles[n-1];
7        for(int i =n-2;i>= 0;i--){
8            suffixSum[i] = piles[i]+suffixSum[i+1];
9        }
10        for(int i = n-1; i >= 0; i--){
11            for(int m = 1; m <= n;m++){
12                if(i+2*m >= n){
13                    dp[i][m] = suffixSum[i];
14                }else{
15                    for(int x = 1; x <= 2*m;x++){
16                        dp[i][m] = Math.max(dp[i][m], suffixSum[i] - dp[i+x][Math.max(m,x)]);
17                    }
18                }
19            }
20        }
21        return dp[0][1];
22    }
23}