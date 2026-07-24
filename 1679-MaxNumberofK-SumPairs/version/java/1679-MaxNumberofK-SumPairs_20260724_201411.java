// Last updated: 7/24/2026, 8:14:11 PM
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        int i = 0;
4        int j = nums.length-1;
5        int count = 0;
6        Arrays.sort(nums);
7        while(i<j){
8            if(nums[i] + nums[j] == k){
9                nums[i] = 0;
10                nums[j] = 0;
11                i++;
12                j--;
13                count++;
14            }
15            else if(nums[i] + nums[j] < k){
16                i++;
17            }
18            else{
19                //i++;
20                j--;
21            }
22        }
23        return count;
24    }
25}