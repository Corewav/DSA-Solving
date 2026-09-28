// Last updated: 9/28/2026, 4:21:11 PM
1class Solution {
2    public int maxDepth(String s) {
3        int count=0;
4        int maxCount=count;
5       for(int i=0;i<s.length();i++){
6        if(s.charAt(i)=='('){
7            count++;
8            maxCount=Math.max(count,maxCount);
9        }else if(s.charAt(i)==')'){
10            count--;
11        }
12        maxCount=Math.max(count,maxCount);
13       } 
14       return maxCount;
15    }
16}