// Last updated: 7/23/2026, 9:32:02 AM
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append(c);
            }
            else if (c == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }
            else if (c == '#') {
                result.append(result.toString());
            }
            else if (c == '%') {
                result.reverse();
            }
        }
        return result.toString();
    }
}