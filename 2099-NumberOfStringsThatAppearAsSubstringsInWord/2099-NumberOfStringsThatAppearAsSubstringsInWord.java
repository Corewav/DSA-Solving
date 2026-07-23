// Last updated: 7/23/2026, 9:32:45 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s : patterns){
            if(word.contains(s)) count++;
        }
        return count;
    }
}