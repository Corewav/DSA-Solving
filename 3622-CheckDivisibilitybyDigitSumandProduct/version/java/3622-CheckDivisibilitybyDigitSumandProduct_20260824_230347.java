// Last updated: 8/24/2026, 11:03:47 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum = 0,prod = 1,copy = n;
4        while(n>0){
5            int rem = n % 10;
6            sum += rem;
7            prod *= rem;
8            n /= 10;
9        }
10        return (copy % (sum+prod) == 0)? true : false;
11    }
12}