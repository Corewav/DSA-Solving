// Last updated: 8/7/2026, 10:51:08 PM
1class Solution {
2    public boolean isUgly(int n){
3        if(n <= 0) return false;
4        int[] factors = {2, 3, 5};
5        for(int factor : factors){
6            while(n % factor == 0){
7                n/=factor;
8            }
9        }
10        return n == 1;
11    }
12}