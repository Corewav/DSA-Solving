// Last updated: 7/23/2026, 9:33:36 AM
import java.util.PriorityQueue;

class Solution {
    public int[] sortArray(int[] nums) {
        // Use a min heap to ensure O(n log n) time complexity
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Step 1: Add all elements into the min-heap
        for (int num : nums) {
            minHeap.add(num);
        }

        // Step 2: Extract the minimum element from the heap and store it in the result
        int i = 0;
        while (!minHeap.isEmpty()) {
            nums[i++] = minHeap.poll();
        }

        return nums;
    }
}
