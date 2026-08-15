// Last updated: 8/15/2026, 10:31:45 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int a = 0;
4        boolean bit = false;
5        for(int num : nums){
6            if(!bit && num != 0){
7                bit = true;
8            }
9            a ^= num;
10        }
11        if(!bit){
12            return 0;
13        }
14        return a != 0 ? nums.length : nums.length - 1;
15    }
16}