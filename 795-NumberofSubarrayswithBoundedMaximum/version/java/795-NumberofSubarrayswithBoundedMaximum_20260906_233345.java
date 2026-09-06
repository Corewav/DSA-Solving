// Last updated: 9/6/2026, 11:33:45 PM
1class Solution {
2    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
3        int len = nums.length,l=0,r=0,subCount=0,count=0;
4        while(r<len){
5            if(nums[r]>right){
6                subCount=0;
7                l=r+1;
8            }else if((nums[r]>=left && nums[r]<=right)){
9                subCount=r-l+1;
10            }
11            r++;
12            count+=subCount;
13        }
14        return count;
15    }
16}