// Last updated: 7/23/2026, 9:31:35 AM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;

        int n = nums.length;
        int answer = 0;
        
        for(int start = 0; start < n; start++){
            long sum = 0;

            for(int end = start; end < n; end++){
                sum += nums[end];

                if(isValid(sum, x)){
                    answer++;
                }
            }
        }
        return answer;
    }
    private boolean isValid(long sum, int x){
        int lastDigit = (int)(sum % 10);
        
        if(lastDigit != x){
            return false;
        }
        while(sum >= 10){
            sum /= 10;
        }
        int firstDigit = (int) sum;
        
        return firstDigit == x;
    }
}