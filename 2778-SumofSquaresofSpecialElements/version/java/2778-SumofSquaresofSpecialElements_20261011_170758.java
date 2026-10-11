// Last updated: 10/11/2026, 5:07:58 PM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int ans = 0;
4        for(int i = 0; i < nums.length; i++){
5            if(nums.length % (i+1) ==0){
6                ans += nums[i] * nums[i];
7            }
8        }
9        return ans;
10    }
11}