// Last updated: 7/29/2026, 8:15:48 PM
1class Solution {
2    public List<Integer> partitionLabels(String s) {
3        List<Integer> partitions = new ArrayList<>();
4            int[] last = new int[26];
5            
6
7        for(int i = 0; i <s.length();i++){
8            last[s.charAt(i)-'a']=i;
9        }
10        int start = 0;
11        int end = 0;
12        for(int i = 0; i< s.length(); i++){
13            end = Math.max(end, last[s.charAt(i)-'a']);
14            if(i == end){
15                // start + 1;
16                partitions.add(end - start+1);
17                start = i + 1;
18            }
19        }
20        return partitions;
21    }
22}