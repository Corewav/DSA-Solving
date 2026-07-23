// Last updated: 7/23/2026, 9:31:30 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxSoFar = nums[0];
        int ans= 0;

        for(int j = k; j < n; j++){
            maxSoFar = Math.max(maxSoFar, nums[j-k]);
            ans = Math.max(ans, maxSoFar + nums[j]);
        }
        return ans;
    }
}