// Last updated: 7/23/2026, 9:35:34 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int max = 1;
        for(int i = 1; i< n; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                count++;
            } else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
