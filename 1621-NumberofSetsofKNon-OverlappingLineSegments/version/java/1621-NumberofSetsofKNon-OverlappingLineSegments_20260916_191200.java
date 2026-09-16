// Last updated: 9/16/2026, 7:12:00 PM
1class Solution {
2    int mod=1000_000_007;
3    Long dp[][];
4    long find(int n,int k){
5        if(k==1)
6            return (n*(n-1)/2)%mod;
7        if(dp[n][k]!=null)return dp[n][k];
8         long result=0;
9        for(int i=1;i<=n-k;i++) result=(result+i*find(n-i,k-1))%mod;
10          return dp[n][k]=result;
11    }
12    public int numberOfSets(int n, int k){
13        dp=new Long[n+1][k+1];
14      return (int)(find(n,k)%mod);
15    }
16}