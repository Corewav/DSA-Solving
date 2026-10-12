// Last updated: 10/12/2026, 1:33:06 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int max = Integer.MIN_VALUE;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        DOBT (root);
21        return max;    
22        
23    }
24    private int DOBT(TreeNode root)
25    {
26        if(root == null)
27        return 0;
28        int L =DOBT(root.left);
29        int R = DOBT(root.right);
30        max = Math.max(max, L+R);
31        return 1+Math.max(L,R);
32    }
33}