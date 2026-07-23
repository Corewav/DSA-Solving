// Last updated: 7/23/2026, 9:32:39 AM
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans = 0;
        for ( int i =0;i<n;i++){
            if(colors[i] != colors[0])
                ans = Math.max(ans, i);
            if(colors[i] != colors[n-1])
                ans = Math.max(ans, n-1-i);
        }
        return ans;
    }
}