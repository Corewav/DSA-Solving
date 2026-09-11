// Last updated: 9/11/2026, 11:48:05 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        Set<Integer> set=new HashSet<>();
4
5        int n=digits.length;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<n;j++){
8                if(i==j)continue;
9                for(int k=0;k<n;k++){
10                    if(k==i || k==j)continue;
11
12                    int d1=digits[i];
13                    int d2=digits[j];
14                    int d3=digits[k];
15                    if(d1==0 || d3%2!=0)continue;
16                    int num=d1*100+d2*10+d3;
17                    set.add(num);
18                }
19            }
20        }
21        return set.size();
22    }
23}