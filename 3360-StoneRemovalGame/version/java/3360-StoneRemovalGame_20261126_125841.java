// Last updated: 11/26/2026, 12:58:41 PM
1class Solution {
2    public boolean canAliceWin(int n) {
3        int remove=10;
4        boolean flag=true;
5        while(n>=remove){
6            n-=remove;
7            remove--;
8            flag=!flag;
9        }
10        return !flag;
11    }
12}