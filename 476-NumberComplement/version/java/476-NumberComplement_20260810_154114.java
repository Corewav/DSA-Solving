// Last updated: 8/10/2026, 3:41:14 PM
1class Solution {
2    public int findComplement(int num) {
3        int sum =0;
4        int base =0;
5        while(sum<num){
6            sum += Math.pow(2, base);
7            base++;
8        }
9        return sum - num;
10    }
11}