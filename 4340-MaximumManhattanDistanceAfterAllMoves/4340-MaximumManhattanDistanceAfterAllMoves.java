// Last updated: 7/23/2026, 9:31:31 AM
class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int empty = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'R') x++;
            else if(ch == 'L') x--;
            else if(ch == 'U') y++;
            else if(ch == 'D') y--;
            else empty++;
        }
        return Math.abs(x) + Math.abs(y) + empty;
    }
}