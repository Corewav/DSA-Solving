// Last updated: 8/23/2026, 12:31:38 AM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int res=0;
4        char last = s.charAt(0);
5        int z=0,o=0;
6        for(int i=0;i<s.length();i++){
7            char c = s.charAt(i);
8            if(last!=c){
9                res += Math.min(z,o);
10                if(last=='0')
11                o=0;
12                else
13                z=0;
14                last=c;
15            }
16            if(c=='1')
17            o++;
18            else
19            z++;
20        }
21        res += Math.min(z,o);
22        return res;
23    }
24}