// Last updated: 7/23/2026, 9:33:42 AM
class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                cnt++;
            } else {
                cnt--;

                if (s.charAt(i - 1) == '(') {
                    ans += 1 << cnt;
                }
            }
        }

        return ans;
    }
}