// Last updated: 10/1/2026, 10:31:02 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(char c: s.toCharArray()){
5            if(c == '(' || c == '{' || c == '['){
6                stack.push(c);
7            }
8            else{
9                if(stack.isEmpty()) return false;
10                char top = stack.pop();
11                if((c == ')' && top != '(') ||
12                    (c == '}' && top != '{') ||
13                    (c == ']' && top != '[')){
14                        return false;
15                    }
16            }
17        }
18        return stack.isEmpty();
19    }
20}