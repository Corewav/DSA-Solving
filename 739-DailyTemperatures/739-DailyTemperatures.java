// Last updated: 7/23/2026, 9:33:50 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty()  &&   temperatures[st.peek()] < temperatures[i]){
                
                    int idx = st.pop();
                    ans[idx]=i-idx;
                
                
            }
            st.push(i);
        }
        return ans;
    }
}