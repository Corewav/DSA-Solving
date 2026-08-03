// Last updated: 8/3/2026, 7:58:07 PM
1class Solution {
2    public int bitwiseComplement(int n) {
3        if(n==0)return 1;
4        int res = 0;
5        int fac = 1;
6        while( n != 0){
7            res += fac*(n%2 == 0?1:0);
8            fac *= 2;
9            n /=2;
10        }
11        return res;
12    }
13}