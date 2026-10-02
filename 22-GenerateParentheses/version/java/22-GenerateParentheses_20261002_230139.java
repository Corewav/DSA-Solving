// Last updated: 10/2/2026, 11:01:39 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ll = new ArrayList<>();
4        generate(ll,"",0,0,n);
5        return ll;
6    }
7    private void generate(List<String> ll , String ans , int open ,int close ,int n){
8        if(open == n && close == n){
9            ll.add(ans);
10            return;
11        }
12        if(open<n)generate(ll , ans+"(" , open+1 , close , n);
13        if(open>close)generate(ll , ans+")" , open , close+1 , n);
14    }
15}