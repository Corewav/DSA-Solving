// Last updated: 8/20/2026, 6:47:20 PM
1class Solution {
2    public int countSegments(String s) {
3        if(s.equals("")){
4            return 0;
5        }
6        String[] arr = s.split(" ");
7        int k = 0;
8        for(int i =0;i<arr.length;i++){
9            if(arr[i] != ""){
10                k++;
11            }
12        }
13        return k;
14    }
15}