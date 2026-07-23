// Last updated: 7/23/2026, 9:33:06 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        for( int i = 1; i < n;i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}