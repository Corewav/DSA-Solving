// Last updated: 7/23/2026, 9:36:23 AM
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n < 0){
            return 1 / myPow(x, -(n + 1)) / x;

        }
        double half = myPow(x,n/2);
        if(n % 2 == 0) return half * half;
        else return x* half * half;
    }
}