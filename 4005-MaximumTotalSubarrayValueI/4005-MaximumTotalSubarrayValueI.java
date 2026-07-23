// Last updated: 7/23/2026, 9:31:53 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        return  (long)(nums[nums.length-1] - nums[0])*k;
    }
}