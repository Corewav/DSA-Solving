// Last updated: 7/26/2026, 10:17:17 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length-1;
        int count = 0;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i] + nums[j] == k){
                nums[i] = 0;
                nums[j] = 0;
                i++;
                j--;
                count++;
            }
            else if(nums[i] + nums[j] < k){
                i++;
            }
            else{
                //i++;
                j--;
            }
        }
        return count;
    }
}