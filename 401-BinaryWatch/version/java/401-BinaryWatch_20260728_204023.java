// Last updated: 7/28/2026, 8:40:23 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String>result = new ArrayList<>();
4        for(int hour = 0; hour < 12; hour++){
5            for(int minute = 0; minute < 60; minute++){
6                if(Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn){
7                    result.add(String.format("%d:%02d", hour, minute));
8                }
9            }
10        }
11        return result;
12    }
13}