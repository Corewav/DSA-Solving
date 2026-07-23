// Last updated: 7/23/2026, 9:34:32 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum +=num;

        }
        return expectedSum - actualSum;
        
    }
}