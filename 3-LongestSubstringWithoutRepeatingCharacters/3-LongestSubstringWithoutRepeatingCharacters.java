// Last updated: 7/23/2026, 9:36:54 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxlength = 0;
        for(int right = 0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength,right-left+1);
        }

        return maxlength;
    }
}