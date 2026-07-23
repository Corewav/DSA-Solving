// Last updated: 7/23/2026, 9:32:31 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int len = pref.length();
        for (String word : words) {
            if (word.length() >= len && word.substring(0, len).equals(pref)) {
                count++;
            }
        }
        return count;
    }
}