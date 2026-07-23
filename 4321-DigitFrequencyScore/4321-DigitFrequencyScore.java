// Last updated: 7/23/2026, 9:31:34 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int score =0;
        while(n>0){
            score += n%10;
            n /= 10;
        }
        return score;
    }
}