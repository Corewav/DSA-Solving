// Last updated: 7/23/2026, 9:35:36 AM
class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
        s = s.toLowerCase();
        
        while (p1 < p2) {
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);

            // Skip non-alphanumeric characters
            if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')) {
                p1++;
                continue;
            }
            if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')) {
                p2--;
                continue;
            }

            // If characters don't match, return false
            if (ch1 != ch2) {
                return false;
            }

            // Move pointers inward
            p1++;
            p2--;
        }

        return true;
    }
}
