// Last updated: 7/30/2026, 10:53:54 PM
1class Solution {
2    public int subsetXORSum(int[] nums) {
3        int total = 0;
4        for(int num : nums){
5            total |= num;
6        }
7        return total * (1 << (nums.length - 1));
8    }
9}