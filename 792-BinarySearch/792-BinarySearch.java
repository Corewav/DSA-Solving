// Last updated: 7/23/2026, 9:33:47 AM
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid to avoid overflow
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Narrow search to the right half
            } else {
                right = mid - 1; // Narrow search to the left half
            }
        }

        return -1; // Target not found
    }
}
