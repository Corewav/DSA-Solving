// Last updated: 11/28/2026, 1:25:50 PM
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3        int n = items.length;
4        int[] freq = new int[n+1];
5        int minCost = Integer.MAX_VALUE;
6        for(int [] item :items){
7            minCost = Math.min(minCost, item[1]);
8            freq[item[0]]++;
9        }
10        int [] gain = new int[n+1];
11        for(int i = 1; i <= n; i++){
12            if(freq[i] == 0)continue;
13            int cnt = 0;
14            for(int j = i; j <= n; j +=i){
15                cnt += freq[j];
16            }
17            gain[i] = cnt -1;
18        }
19        Arrays.sort(items,(a,b) -> Integer.compare(a[1], b[1]));
20        int ans = 0;
21        for(int [] item : items){
22            int factor = item[0];
23            int price = item[1];
24            if(2 * minCost < price) continue;
25            int buy = Math.min(gain[factor], budget/price);
26            ans += 2 * buy;
27            budget -= buy * price;
28        }
29        return ans + (budget/ minCost);
30    }
31}