// Last updated: 11/18/2026, 9:45:38 AM
1class Solution {
2    public int minChanges(String s) {
3        int count = 0;
4        for(int i = 0; i<s.length()-1 && (count += s.charAt(i) !=s.charAt(i+1) ? 1 : 0) > -1; i+=2);
5        return count;
6    }
7}