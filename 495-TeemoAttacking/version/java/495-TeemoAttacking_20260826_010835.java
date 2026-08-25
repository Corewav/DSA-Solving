// Last updated: 8/26/2026, 1:08:35 AM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int count = 0;
4        for(int i = 0;i<timeSeries.length -1;i++){
5            int gap = timeSeries[i+1] - timeSeries[i];
6            count += Math.min(gap,duration);
7        }
8        count += duration;
9        return count;
10    }
11}