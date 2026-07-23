// Last updated: 7/23/2026, 9:34:19 AM
class Solution {
    public int minPatches(int[] nums, int n) {
        long miss = 1;
        int i =0,patches =0;
        while(miss <= n){
            if(i<nums.length && nums[i] <=miss){
                miss += nums[i];
                i++;
            }
            else {
                miss+=miss;
                patches++;
            }
        }
        return patches;
    }
}