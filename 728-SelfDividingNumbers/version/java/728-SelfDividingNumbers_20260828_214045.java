// Last updated: 8/28/2026, 9:40:45 PM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> res = new ArrayList<>();
4        for(int i = left, n = 0; i <= right; i++){
5            for(n = i; n > 0;n/=10){
6                if(n % 10 == 0 || i %(n%10) != 0) break;
7            }
8            if(n == 0){
9                res.add(i);
10            }
11        }
12        return res;
13    }
14}