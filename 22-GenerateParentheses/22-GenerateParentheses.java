// Last updated: 7/23/2026, 9:36:37 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        generate(ll,"",0,0,n);
        return ll;
    }
    private void generate(List<String> ll , String ans , int open ,int close ,int n){
        if(open == n && close == n){
            ll.add(ans);
            return;
        }
        if(open<n)generate(ll , ans+"(" , open+1 , close , n);
        if(open>close)generate(ll , ans+")" , open , close+1 , n);
    }
}