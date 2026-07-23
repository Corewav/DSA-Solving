// Last updated: 7/23/2026, 9:33:57 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep = -1,missing =-1;
        for(int i =1;i<= nums.length;i++){
            int count =0;
            for(int j =0;j <nums.length;j++){
                if(nums[j] == i){
                    count++;
                }
            }
            if(count ==2){
                rep =i;
            } else if(count ==0){
                missing =i;
            }
        }
        return new int [] {rep,missing};
    }
}