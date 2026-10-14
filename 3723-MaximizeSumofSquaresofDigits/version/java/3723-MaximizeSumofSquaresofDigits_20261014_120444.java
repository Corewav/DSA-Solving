// Last updated: 10/14/2026, 12:04:44 PM
1class Solution {
2    
3    public String maxSumOfSquares(int num, int sum) {
4        if (sum<1 || sum>9*num) {
5        return "";
6        }
7        int rem=sum;
8        
9        StringBuilder sb=new StringBuilder();
10        for(int i=0;i<num;i++){
11            int d=Math.min(9,rem);
12            sb.append(d);
13            rem=rem-d;
14        }
15        
16        return sb.toString();
17    }
18}