// Last updated: 7/29/2026, 8:47:38 PM
1class Solution{
2    int[][] dp;
3    public int longestPalindromeSubseq(String s){
4        int n = s.length();
5        dp =new int[n][n];
6        for(int i = 0; i < n; i++){
7            Arrays.fill(dp[i], -1);
8        }
9        return helper(s, 0, n - 1);
10    }
11    public int helper(String s, int i, int j){
12        if(i > j)
13            return 0;
14        if(i == j)
15            return 1;
16        if(dp[i][j] != -1)
17            return dp[i][j];
18        if(s.charAt(i) == s.charAt(j)){
19            dp[i][j] = 2 + helper(s, i + 1, j - 1);
20        }else{
21            dp[i][j] = Math.max(
22                    helper(s, i + 1, j),
23                    helper(s, i, j - 1));
24        }
25        return dp[i][j];
26    }
27}