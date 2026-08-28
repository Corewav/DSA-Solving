// Last updated: 8/28/2026, 9:37:01 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int sum = 0;
4        for(int i=1; i < num; i++){
5            if(num % i == 0) sum += i;
6        }
7        if(num == sum){
8            return true;
9        }else{
10            return false;
11        }
12    }
13}