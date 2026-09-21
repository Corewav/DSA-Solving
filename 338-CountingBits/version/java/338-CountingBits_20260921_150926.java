// Last updated: 9/21/2026, 3:09:26 PM
1class Solution {
2    public int[] countBits(int n) {
3        int [] temp = new int[n+1];
4        for(int i=0; i<=n; i++){
5            temp[i] = temp[i>>1] + i%2;
6        }
7        return temp;
8    }
9}