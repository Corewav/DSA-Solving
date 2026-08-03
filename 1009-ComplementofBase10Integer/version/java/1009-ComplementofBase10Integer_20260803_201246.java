// Last updated: 8/3/2026, 8:12:46 PM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int[][] ans = new int[mat.length][mat.length];
4        int c=0;
5        for(int i =1;i<5;i++){
6            for(int j=0; j<mat.length;j++){
7                for(int k=0; k <mat.length;k++){
8                    ans [j][k]= mat[k][mat.length-j-1];
9                }
10            }
11            c=0;
12            for(int j=0;j<mat.length;j++){
13                for(int k=0;k<mat.length;k++){
14                    if(ans[j][k] == target[j][k]){
15                        c++;
16                    }
17                }
18            }
19            if(c==(mat.length*mat.length)){
20                return true;
21            }
22            for(int j=0;j<mat.length;j++){
23                for(int k=0;k<mat.length;k++){
24                    mat[j][k]= ans[j][k];
25                }
26            }
27        }
28        return false;
29    }
30}