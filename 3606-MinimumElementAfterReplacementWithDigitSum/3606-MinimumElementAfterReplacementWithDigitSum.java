// Last updated: 7/23/2026, 9:32:08 AM
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int el : nums){
            min = Math.min(min,get(el));
        }
        return min;   
    }
    int get(int el){
        int sum =0;
        while(el != 0){
            sum += el%10;
            el /= 10;
        }
        return sum;
    }
}