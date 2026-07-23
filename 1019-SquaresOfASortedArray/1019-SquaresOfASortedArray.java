// Last updated: 7/23/2026, 9:33:31 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i= 0; i<nums.length;i++){
            nums[i] = nums[i] * nums[i];

        }
        Arrays.sort(nums);
        return nums;
        
    }
}