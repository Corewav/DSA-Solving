// Last updated: 7/24/2026, 8:18:34 PM
1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if(!(str1 + str2).equals(str2 + str1)){
4            return "";
5        }
6        int len1 = str1.length();
7        int len2 = str2.length();
8        int gcdLength = gcd(len1,len2);
9        return str1.substring(0,gcdLength);
10    }
11    private int gcd(int a,int b ){
12        while(b!=0){
13            int temp = b;
14            b=a%b;
15            a= temp;
16        }
17        return a;
18    }
19}