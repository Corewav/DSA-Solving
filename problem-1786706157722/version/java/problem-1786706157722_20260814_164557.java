// Last updated: 8/14/2026, 4:45:57 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int n= s.length();
4        int i=0,j=0,len=0;
5        Map<Character,Integer> mp= new HashMap<>();
6        while(j<n){
7            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
8            while(mp.get(s.charAt(j))>2){
9                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
10                if(mp.get(s.charAt(i))==0) mp.remove(s.charAt(i));
11                i++;
12            }
13            len=Math.max(len,j-i+1);
14            j++;
15        }
16        return len;
17    }
18}