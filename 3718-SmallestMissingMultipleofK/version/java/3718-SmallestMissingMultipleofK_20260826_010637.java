// Last updated: 8/26/2026, 1:06:37 AM
1
2class Solution {
3    public int missingMultiple(int[] nums, int k) {
4        HashSet<Integer> seen = new HashSet<>();
5        for(int num : nums){
6            seen.add(num);
7        }
8        int cur = k;
9        while(seen.contains(cur)){
10            cur += k;
11        }
12        return cur;
13    }
14}