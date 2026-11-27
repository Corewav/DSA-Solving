// Last updated: 11/27/2026, 11:12:11 AM
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3        int [] f = new int[budget+1];
4        int mn = Integer.MAX_VALUE;
5        for(int[] item : items){
6            int factor = item[0], price = item[1];
7            mn = Math.min(mn,price);
8            int cnt = 0;
9            for(int[] other : items){
10                if(other[0] % factor == 0){
11                    cnt++;
12                }
13            }
14            for(int j = budget; j >= price; j--){
15                f[j] = Math.max(f[j], f[j-price]+cnt);
16            }
17        }
18        int ans = 0;
19        for(int j = 0; j <= budget; j++){
20            ans = Math.max(ans, f[j] + (budget - j)/mn);
21        }
22        return ans;
23    }
24}