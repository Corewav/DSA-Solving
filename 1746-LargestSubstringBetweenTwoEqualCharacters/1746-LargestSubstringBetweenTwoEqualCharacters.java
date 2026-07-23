// Last updated: 7/23/2026, 9:33:02 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';

            if (firstIndex[charIndex] == -1) {
                firstIndex[charIndex] = i; 
            } else {
                maxLength = Math.max(maxLength, i - firstIndex[charIndex] - 1);
            }
        }

        return maxLength;
    }
}
