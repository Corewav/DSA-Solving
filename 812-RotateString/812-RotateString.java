// Last updated: 7/23/2026, 9:33:46 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}