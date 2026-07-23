// Last updated: 7/23/2026, 9:32:14 AM
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char[] chars = moves.toCharArray();
        int countL = 0, countR = 0, counter_ = 0;
        for(char aChar : chars){
            if(aChar == 'L'){
                countL++;
            } else if(aChar == 'R'){
                countR++; 
            } else if(aChar == '_'){
                counter_++;
            }
        }
        return Math.abs(countL - countR) + counter_;
    }
}