// Last updated: 7/23/2026, 9:31:36 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            long sum = 0;

            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }
            int remainder = (int)(sum % 26);
            ans.append((char)('z' - remainder));
        }
        return ans.toString();
    }
}