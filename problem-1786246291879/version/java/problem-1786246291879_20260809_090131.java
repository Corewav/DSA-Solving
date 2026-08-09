// Last updated: 8/9/2026, 9:01:31 AM
1class Solution {
2    public double minPrice(int[] prices, int[] dis) {
3        // for(int i =0;i<prices.length-1;i++){
4        //     for(int j = i+1;j<prices.length;j++){
5        //         if(prices[i]<prices[j]){
6        //             int temp = prices[i];
7        //             prices[i] = prices[j];
8        //             prices[j] = temp;
9        //         }
10        //     }
11        // }
12        // for(int i =0;i<dis.length-1;i++){
13        //     for(int j=i+1;j<dis.length;j++){
14        //         if(dis[i] < dis[j]){
15        //             int temp = dis[i];
16        //             dis[i] = dis[j];
17        //             dis[j]=temp;
18        //         }
19        //     }
20        // }
21        // double total =0;
22        // for(int i = 0;i <prices.length;i++){
23        //     if(i<dis.length){
24        //         total += prices[i] * (100 - dis[i]) / 100.0;
25        //     }else{
26        //         total += prices[i];
27        //     }
28        // }
29        // return total;
30
31        Arrays.sort(prices);
32        Arrays.sort(dis);
33        double total = 0;
34        int p = prices.length -1;
35        int d = dis.length -1;
36        while(p >= 0 && d >= 0){
37            total += prices[p] * (100 - dis[d])/ 100.0;
38            p--;
39            d--;
40        }
41        while(p >= 0){
42            total += prices[p];
43            p--;
44            
45        }
46        return total;
47    }
48}