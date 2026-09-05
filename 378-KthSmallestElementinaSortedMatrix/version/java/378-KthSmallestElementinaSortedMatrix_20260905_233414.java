// Last updated: 9/5/2026, 11:34:14 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        int count = 0;
5        for(int i=0;i<matrix.length;i++){
6            for(int j=0;j<matrix[0].length;j++){
7                pq.add(matrix[i][j]);
8                count++;
9            }
10        }
11        for(int i=1;i<k;i++){
12            pq.poll();
13        }
14        return pq.peek();
15    }
16}