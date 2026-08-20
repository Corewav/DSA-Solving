// Last updated: 8/20/2026, 6:43:25 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long low = 0, high = num;
4        while(low <= high){
5            long mid = (low + high) /2;
6            long midsquare = mid * mid;
7            if(midsquare == num){
8                return true;
9            }else if(midsquare > num){
10                high = mid - 1;
11            }else{
12                low = mid + 1;
13            }
14        }
15        return false;
16    }
17}