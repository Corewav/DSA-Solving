// Last updated: 8/6/2026, 6:47:15 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true){
4            int num = n;
5            int product = 1;
6
7            while(num>0){
8                int dig = num%10;
9                product*=dig;
10                num/=10;
11            }
12            if(product%t==0) return n;
13            n++;
14        }
15    }
16}