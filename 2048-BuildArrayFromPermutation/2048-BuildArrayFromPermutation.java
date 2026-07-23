// Last updated: 7/23/2026, 9:32:47 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int [] temp = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            temp[i] = nums[nums[i]];
        }
        return temp;
    }
}