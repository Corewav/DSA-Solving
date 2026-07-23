// Last updated: 7/23/2026, 9:34:04 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0, ans =0;
        for(int num : nums){
            if(num ==1){
                count ++;
            } else{
                count =0;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}