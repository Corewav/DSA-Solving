// Last updated: 7/23/2026, 9:34:16 AM
class Solution {
    public void reverseString(char[] s) {
        int left= 0;
        int right =s.length-1;
        while(left < right){
            char temp=s[right];
            s[right--]=s[left];
            s[left++]=temp;
        }

        
        
    }
}