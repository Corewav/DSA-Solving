// Last updated: 8/13/2026, 11:29:14 PM
1class Solution{
2    List<List<String>> ans;
3    public List<List<String>> partition(String s){
4        ans = new ArrayList<>();
5        helper(s,0,new ArrayList<>());
6        return ans;
7    }
8    private void helper(String s, int i, List<String> temp){
9        if(i==s.length()){
10            ans.add(new ArrayList<>(temp));
11            return;
12        }
13        for(int j=i;j<s.length();j++){
14            if(isPalindrome(s,i,j)){
15                temp.add(s.substring(i,j+1));
16                helper(s,j+1,temp);
17                temp.remove(temp.size()-1);
18            }
19        }
20    }
21    private boolean isPalindrome(String s, int i, int j){
22        while(i<j){
23            if(s.charAt(i)!=s.charAt(j)) return false;
24            i++; j--;
25        }
26        return true;
27    }
28}