// Last updated: 7/23/2026, 9:34:51 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll(); // smallest nikal do
            }
        }
        return pq.peek();
    }
}