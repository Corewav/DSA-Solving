// Last updated: 7/28/2026, 8:33:58 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        char[] sArray = s.toCharArray();
4        char[] tArray = t.toCharArray();
5        Arrays.sort(sArray);
6        Arrays.sort(tArray);
7        for(int i = 0; i < sArray.length; i++){
8            if(sArray[i] != tArray[i]){
9                return tArray[i];
10            }
11        }
12        return tArray[tArray.length - 1];
13    }
14}