// Last updated: 7/23/2026, 9:32:42 AM
class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        int endsWithOne =0;
        int endsWithTwo =0;
        int MOD = 1_000_000_007;
        int hasZero =0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '1'){
                endsWithOne = (endsWithOne + endsWithTwo + 1)%MOD;
            } else{
                hasZero =1;
                endsWithTwo = (endsWithOne + endsWithTwo)%MOD;
            }
        }
        int ans = (endsWithOne + endsWithTwo + hasZero)%MOD;
        return ans;
    }
}