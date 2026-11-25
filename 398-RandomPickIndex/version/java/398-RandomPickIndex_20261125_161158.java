// Last updated: 11/25/2026, 4:11:58 PM
1class Solution {
2    Random rand ;
3    Map<Integer, List<Integer>> mp;
4    public Solution(int[] nums) {
5        mp = new HashMap<>();
6        rand = new Random();
7        for(int i =0; i<nums.length;i++) {
8            mp.computeIfAbsent(nums[i], k->new ArrayList<>()).add(i);
9        }
10    }
11    
12    public int pick(int target) {
13        int indx = rand.nextInt(mp.get(target).size());
14        return mp.get(target).get(indx);
15    }
16}
17
18
19/**
20 * Your Solution object will be instantiated and called as such:
21 * Solution obj = new Solution(nums);
22 * int param_1 = obj.pick(target);
23 */