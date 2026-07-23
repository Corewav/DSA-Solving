// Last updated: 7/23/2026, 9:35:24 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums) ans ^= n;
        return ans;
    }
}