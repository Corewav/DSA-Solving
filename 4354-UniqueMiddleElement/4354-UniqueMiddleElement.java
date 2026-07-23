// Last updated: 7/23/2026, 9:31:28 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int target = nums[mid];
        int count = 0;

        for (int num : nums){
            if(num == target){
                count++;
            }
        }
        return count == 1;
        
    }
}