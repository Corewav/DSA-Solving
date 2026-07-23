// Last updated: 7/23/2026, 9:34:28 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums [nums[fast]];
        }
        while(slow!=fast);

        slow = nums[0];
        while 
        (slow!=fast){

            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        
    }
}