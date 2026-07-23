// Last updated: 7/23/2026, 9:33:10 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int [] ans= new int[n];
        for(int i =0;i<n;i++){
            int smallerCount =0;
            for(int j =0;j < n;j++){
                if(nums[j] < nums[i]){
                    smallerCount++;
                }
            }
            ans[i] = smallerCount;
        }
        return ans;
    }
}