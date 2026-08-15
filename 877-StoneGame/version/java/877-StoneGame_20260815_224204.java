// Last updated: 8/15/2026, 10:42:04 PM
1class Solution {
2    public int reverseBits(int n) {
3        String b = Integer.toBinaryString(n);
4        String sign = "";
5        for(char ch : b.toCharArray()){
6            sign = ch + sign;
7        }
8        for(int i = sign.length(); i < 32; i++){
9            sign += '0';
10        }
11        return (int)(Long.parseLong(sign,2));
12    }
13}