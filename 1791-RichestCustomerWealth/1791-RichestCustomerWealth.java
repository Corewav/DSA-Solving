// Last updated: 7/23/2026, 9:33:01 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int [] i : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}