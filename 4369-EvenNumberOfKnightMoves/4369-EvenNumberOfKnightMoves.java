// Last updated: 7/23/2026, 9:31:25 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0] + start[1] + target[0] + target[1]) % 2 == 0;
    }
}