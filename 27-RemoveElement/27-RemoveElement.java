// Last updated: 7/23/2026, 9:36:34 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}