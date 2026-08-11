// Last updated: 8/11/2026, 3:30:33 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums [0];
4        for(int i=1;i<nums.length;i++){
5            if(nums[i] == nums[i-1]+1){
6                sum = sum+nums[i];
7            }else{
8                break;
9            }
10        }
11        for(int i=0;i<nums.length;i++){
12            if(sum==nums[i]){
13                sum=sum+1;
14                i=-1;
15            }
16        }
17        return sum;
18    }
19}