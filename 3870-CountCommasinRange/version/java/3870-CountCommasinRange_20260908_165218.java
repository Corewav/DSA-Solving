// Last updated: 9/8/2026, 4:52:18 PM
1class Solution {
2    public int countCommas(int n) {
3        if(n<1000){
4            return 0;
5        }
6        return n-999;
7    }
8}