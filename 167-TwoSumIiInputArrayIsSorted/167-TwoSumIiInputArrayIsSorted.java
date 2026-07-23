// Last updated: 7/23/2026, 9:35:13 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r = numbers.length-1;
        while(numbers[l]+numbers[r]!= target)
        if(numbers[l]+numbers[r]<target)
        ++l;
        else
        --r;
        return new int[] {l+1,r+1};
        
        
    }
}