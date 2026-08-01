// Last updated: 8/1/2026, 8:58:55 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        return helper(nums, 0, nums.length - 1) >= 0;
4    }
5    public int helper(int[] nums, int l, int r){
6        if(l == r){
7            return nums[l];
8        }
9        int takel = nums[l] - helper(nums,l + 1,r);
10        int taker = nums[r] - helper(nums,l,r - 1);
11        return Math.max(takel,taker);
12    }
13}