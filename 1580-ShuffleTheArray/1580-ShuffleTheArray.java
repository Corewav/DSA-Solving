// Last updated: 7/23/2026, 9:33:07 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int [2*n];
        for(int i=0;i<n;i++){
            res[2*i] =nums[i];
            res[2*i+1] = nums[n+i];
        }
        return res;
    }
}