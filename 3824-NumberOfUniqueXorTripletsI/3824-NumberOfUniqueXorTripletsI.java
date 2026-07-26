// Last updated: 7/26/2026, 9:47:03 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<3){
            return n;
        }
        int bit =32-Integer.numberOfLeadingZeros(n);
         return 1<<bit;
            
        
    }
}