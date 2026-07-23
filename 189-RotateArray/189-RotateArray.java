// Last updated: 7/23/2026, 9:35:03 AM
class Solution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    }
    public void reverse(int[] s,int i,int j){  
        int temp;
        while(i<j){
            temp = s[i];
            s[i]=s[j];
            s[j]= temp;
            i++;
            j--;
        }
    }
}


