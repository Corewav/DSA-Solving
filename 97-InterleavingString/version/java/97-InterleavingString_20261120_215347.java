// Last updated: 11/20/2026, 9:53:47 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5        if(m + n != s3.length()) return false;
6        boolean [][] dp = new  boolean[m+1][n+1];
7        dp[0][0] = true;
8        for(int i=1;i<=m;i++){
9            dp[i][0] = dp[i-1][0] && (s1.charAt(i-1) == s3.charAt(i-1));
10        }
11        for(int j=1;j<=n;j++){
12            dp[0][j] = dp[0][j-1] && (s2.charAt(j-1) == s3.charAt(j-1));
13        }
14        for(int i=1;i<=m;i++){
15            for(int j=1;j<=n;j++){
16                char c =s3.charAt(i+j-1);
17                boolean takeS1 = (s1.charAt(i-1) == c) && dp[i-1] [j];
18                boolean takeS2 = (s2.charAt(j-1) == c) && dp[i] [j-1];
19                dp[i][j] = takeS1 || takeS2;
20            }
21        }
22        return dp[m][n];
23    }
24}