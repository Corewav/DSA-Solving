// Last updated: 9/13/2026, 11:36:15 PM
1class Solution {
2    public int largestOverlap(int[][] img1, int[][] img2) {
3        int n = img1.length;
4        List<int[]> l1 = new ArrayList<>();
5        List<int[]> l2 = new ArrayList<>();
6        for(int i=0; i<n; i++){
7            for(int j=0; j<n; j++){
8                if(img1[i][j] == 1)
9                    l1.add(new int[]{i,j});
10                if(img2[i][j] == 1)
11                    l2.add(new int[]{i,j});
12            }
13        }
14        int maxOverlaps = 0;
15        int dp[][] = new int[2*n][2*n];
16        for(int[] arr1 : l1){
17            for(int[] arr2 : l2){
18                int x = arr1[0] - arr2[0] + n;
19                int y = arr1[1] - arr2[1] + n;
20                maxOverlaps = Math.max(maxOverlaps, ++dp[x][y]);
21            }
22        }
23        return maxOverlaps;
24    }
25}