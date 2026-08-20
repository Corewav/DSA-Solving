// Last updated: 8/20/2026, 6:39:37 PM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        List<Integer> arr1=new ArrayList<>();
4        List<Integer> arr2= new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7        for(int i=2;i<nums.length;i++){
8            if(arr1.getLast()>arr2.getLast()){
9                arr1.add(nums[i]);
10            }else{
11                arr2.add(nums[i]);
12            }
13        }
14        arr1.addAll(arr2);
15        int[] ans=new int[arr1.size()];
16        for(int i=0;i<arr1.size();i++){
17            ans[i]=arr1.get(i);
18        }
19        return ans;
20    }
21}