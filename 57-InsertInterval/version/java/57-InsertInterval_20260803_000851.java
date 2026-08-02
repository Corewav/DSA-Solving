// Last updated: 8/3/2026, 12:08:51 AM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        int n = intervals.length;
4        List<int[]> result = new ArrayList<>();
5        int i = 0;
6        while (i < n && intervals[i][1] < newInterval[0]) {
7            result.add(intervals[i]);
8            i++;
9        }
10
11        while (i < n && intervals[i][0] <= newInterval[1]) {
12            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
13            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
14            i++;
15        }
16        result.add(newInterval);
17
18        while (i < n) {
19            result.add(intervals[i]);
20            i++;
21        }
22        return result.toArray(new int [result.size()][]);
23    }
24}