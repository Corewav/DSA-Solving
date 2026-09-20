// Last updated: 9/20/2026, 4:19:07 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int n=s.length();
4        int sum=0;
5        for(int i=1;i<=n;i++){
6            char ch=s.charAt(i-1);
7            int pos=ch-'a';
8            sum=sum+((26-pos)*i);
9        }
10        return sum;
11    }
12}