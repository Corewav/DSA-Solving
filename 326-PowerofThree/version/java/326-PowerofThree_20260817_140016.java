// Last updated: 8/17/2026, 2:00:16 PM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0){
4            return false;
5        }
6        if(n==1){
7            return true;
8        }
9        while(n%3==0){
10            if(n==3){
11                return true;
12            }else{
13                n/=3;
14            }
15        }
16        return false;
17    }
18}