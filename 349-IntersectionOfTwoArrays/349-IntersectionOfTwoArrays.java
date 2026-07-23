// Last updated: 7/23/2026, 9:34:15 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultset = new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                resultset.add(num);
            }
        }
        int[] result = new int[resultset.size()];
        int index = 0;
        for(int num:resultset){
            result[index++]=num;
        }
        return result;
    }
}