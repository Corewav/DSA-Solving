// Last updated: 7/23/2026, 9:32:50 AM
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);
            
            // Check if all three characters are distinct
            if (a != b && a != c && b != c) {
                count++;
            }
        }

        return count;
    }
}
