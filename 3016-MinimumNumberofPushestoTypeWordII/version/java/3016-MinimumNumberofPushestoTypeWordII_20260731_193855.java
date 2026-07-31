// Last updated: 7/31/2026, 7:38:55 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for(char ch : word.toCharArray()){
5            freq[ch - 'a']++;
6        }
7        Arrays.sort(freq);
8        int ans = 0;
9        int position = 0;
10        for(int i = 25; i >= 0; i--){
11            if(freq[i] == 0){
12                continue;
13            }
14            int cost = position/8+1;
15            ans += freq[i]*cost;
16            position++;
17        }
18        return ans;
19    }
20}