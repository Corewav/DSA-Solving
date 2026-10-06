// Last updated: 10/6/2026, 7:17:46 PM
1class Solution {
2    public int minAddToMakeValid(String S) {
3        Stack<Character> st = new Stack<>();
4        char[] arr = S.toCharArray();
5        int count = 0;
6        for(int i=0;i<arr.length;i++){
7            if(arr[i] == '(')
8                st.push(arr[i]);
9            else
10                if(st.isEmpty()){
11                    count++;
12                }
13                else
14                    st.pop();
15        }
16        while(!st.isEmpty()){
17            count++;
18            st.pop();
19        }
20        return count;
21    }
22}