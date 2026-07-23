// Last updated: 7/23/2026, 9:34:33 AM
class Solution {
    public int addDigits(int num) {
        int r;
        if(num>0){
            r = num%9;
            if(r==0){
                r=9;
            }
        }else {
            r=0;
        }
        return r;
        
    }
}