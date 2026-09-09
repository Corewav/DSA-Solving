// Last updated: 9/9/2026, 10:47:19 PM
1class Solution {
2    public long countCommas(long n) {
3        if(n<1000) return 0;
4        long c = 0;
5        for(long i =1000;i<=n;i*=1000){
6            c += n-i+1;
7        }
8        return c;
9    }
10}