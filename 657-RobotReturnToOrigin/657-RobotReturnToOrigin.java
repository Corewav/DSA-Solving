// Last updated: 7/23/2026, 9:33:54 AM
class Solution {
    public boolean judgeCircle(String moves) {
        int countv = 0, counth = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'U') countv++;
            else if(ch == 'D') countv--;
            else if(ch == 'R') counth++;
            else counth--;
        }
        return countv == 0 && counth == 0;
    }
}