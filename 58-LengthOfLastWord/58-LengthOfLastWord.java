// Last updated: 7/23/2026, 9:36:18 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') break;
            length++;
        }
        return length;
    }
}