// Last updated: 7/23/2026, 9:35:10 AM
class Solution {
    public int majorityElement(int[] nums) {
        int can = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0){
                can = num;
            }
            if(num == can){
                count++;
            } else{
                count--;
            }
        }
        return can;



        // element start i 
        // count = 0;
        // for elemnet j
        // if num[i] == num[j]
        // then count be ++
        //  if count > n /2 ;
        //  return num[i];
    }
}