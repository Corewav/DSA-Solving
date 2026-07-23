// Last updated: 7/23/2026, 9:36:51 AM
class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0,right =str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}