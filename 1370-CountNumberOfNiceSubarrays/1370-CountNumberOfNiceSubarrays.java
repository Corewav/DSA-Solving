// Last updated: 7/23/2026, 9:33:16 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int curr = 0;
        map.put(0,1);
        for(int i : nums){
            curr += i % 2;
            count += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr,0) + 1);
        }
        return count;
    }
}