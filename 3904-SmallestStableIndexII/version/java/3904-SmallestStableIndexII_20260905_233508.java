// Last updated: 9/5/2026, 11:35:08 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int[] min = new int[nums.length];
4        int max = nums[0];
5        int current = Integer.MAX_VALUE;
6        for(int i = nums.length-1;i>=0;i--){
7            if(current>nums[i]){
8                current = nums[i];
9            }
10            min[i] = current;
11        }
12        for(int i = 0;i<nums.length;i++){
13            max = Math.max(nums[i],max);
14            if(max-min[i]<=k)return i;
15        }
16        return -1;
17    }
18}