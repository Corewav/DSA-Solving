// Last updated: 7/23/2026, 9:32:19 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n = nums.length;
        int rightSum = 0;
        for(int num : nums){
            rightSum += num;

        }
        int leftSum = 0;
        int [] ans = new int[n];
        for(int i = 0;i<n; i++){
            rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        } 
        return ans;
    }
}