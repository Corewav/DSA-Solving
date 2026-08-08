// Last updated: 8/8/2026, 10:20:28 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        int[] last = new int[m];
6        int j = m-1;
7        for(int i=n-1;i>=0;i--){
8            if(j>=0 && word1.charAt(i) == word2.charAt(j)){
9                last[j] = i;
10                j--;
11            }
12        }
13        int ans[] = new int[m];
14        j = 0;
15        boolean usedMatch = false;
16        for(int i=0;i<n && j<m ;i++){
17            if(word1.charAt(i) == word2.charAt(j)){
18                ans[j] = i;
19                j++;
20            }else if(!usedMatch && (j == m-1 || i+1 <= last[j+1])){
21                ans[j] = i;
22                j++;
23                usedMatch = true;
24            }
25        }
26        if(j != m) return new int[0];
27        return ans;
28    }
29}