// Last updated: 7/30/2026, 2:50:30 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int n = word.length();
4        int count = 0;
5        if(n <= 8)
6        count = n;
7        else if(n <= 16)count = 8 + (n-8)*2;
8        else if(n <= 24) count = 24 + (n - 16)*3;
9        else count = 48 + (n-24)*4;
10        return count;
11    }
12}