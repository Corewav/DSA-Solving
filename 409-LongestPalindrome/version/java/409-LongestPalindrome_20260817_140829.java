// Last updated: 8/17/2026, 2:08:29 PM
1class Solution {
2   public static int longestPalindrome(String s) {
3    Set<Character> a = new HashSet<>();
4    char[] c = s.toCharArray();
5    int length = 0;
6    for(char i : c){
7        if(a.contains(i)){
8            a.remove(i);
9            length = length+2;
10        }
11        else{
12            a.add(i);
13        }
14    }
15    if(a.size() > 0){
16        length++;
17    }
18    return length;
19   }
20}