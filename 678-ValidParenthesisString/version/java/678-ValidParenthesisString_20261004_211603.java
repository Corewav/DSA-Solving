// Last updated: 10/4/2026, 9:16:03 PM
1class Solution {
2    public boolean checkValidString(String s) {
3     int min=0;
4     int max=0;
5     for(int i=0;i<s.length();i++){
6        char ch=s.charAt(i);
7        if(ch=='('){
8            min=min+1;
9            max=max+1;
10        }
11        if(ch==')'){
12            min=min-1;
13            max=max-1;
14        }
15        if(ch=='*'){
16            min=min-1;
17            max=max+1;
18        }
19        if(min<0){
20            min=0;
21        }
22        if(max<0){
23            return false;
24        }
25     }   
26     if(min==0){
27        return true;
28     }
29     return false;
30    }
31}