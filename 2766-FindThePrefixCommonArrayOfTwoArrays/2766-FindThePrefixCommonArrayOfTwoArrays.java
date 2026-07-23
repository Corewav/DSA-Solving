// Last updated: 7/23/2026, 9:32:18 AM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
        int cnt = 0;
        int[] ans = new int[A.length];
        if(A[0] == B[0]){
            ans[0] = 1;
        }
        else{
            ans[0] = 0;
        }
        st1.add(A[0]);
        st2.add(B[0]);
        for(int i = 1; i<A.length; i++){
            if(A[i] == B[i]){
                ans[i] = ans[i-1]+1;
            }
            else if(st1.contains(B[i]) && st2.contains(A[i])){
                ans[i] = ans[i-1]+2;
            }
            else if(st1.contains(B[i]) || st2.contains(A[i])){
                ans[i] = ans[i-1]+1;
            }
            else{
                ans[i] = ans[i-1];
            }
            st1.add(A[i]);
            st2.add(B[i]);
        }
        return ans;
    }
}