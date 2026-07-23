// Last updated: 7/23/2026, 9:36:50 AM
// class Solution {
//     public int maxArea(int[] height) {
//         int i = 0;
//         int j = height.length - 1;
//         int maxWater = 0;

//         while (i < j) {
//             int h = Math.min(height[i], height[j]);
//             int width = j - i;
//             int area = h * width;
//             maxWater = Math.max(maxWater, area);

//             if (height[i] < height[j]) {
//                 i++;
//             } else {
//                 j--;
//             }
//         }

//         return maxWater;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxWater = Math.max(maxWater, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}