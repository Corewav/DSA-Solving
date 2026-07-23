// Last updated: 7/23/2026, 9:34:30 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int place = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[place]=nums[i];
                place++;
            }
        }
        while(place<nums.length){
            nums[place++]=0;
        }
        
    }
}