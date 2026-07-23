// Last updated: 7/23/2026, 9:32:17 AM
import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxDigitMap = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            
            if (maxDigitMap.containsKey(maxDigit)) {
                maxSum = Math.max(maxSum, num + maxDigitMap.get(maxDigit));
                maxDigitMap.put(maxDigit, Math.max(maxDigitMap.get(maxDigit), num));
            } else {
                maxDigitMap.put(maxDigit, num);
            }
        }
        return maxSum;
    }

    private int getMaxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            maxDigit = Math.max(maxDigit, num % 10);
            num /= 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution(); 
        int[] nums = {51, 71, 17, 24, 42};
        System.out.println(sol.maxSum(nums));
    }
}
