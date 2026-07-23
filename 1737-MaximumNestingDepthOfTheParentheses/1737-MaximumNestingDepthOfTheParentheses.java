// Last updated: 7/23/2026, 9:33:03 AM
class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                ans = Math.max(ans, stack.size());
            } else if(ch == ')'){
                stack.pop();
            }
        }
        return ans;
    }
}