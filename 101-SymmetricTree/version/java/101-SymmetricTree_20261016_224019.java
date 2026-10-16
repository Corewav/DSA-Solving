// Last updated: 10/16/2026, 10:40:19 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        if (root == null) return true;
19        return isMirror(root.left, root.right);
20    }
21
22    private boolean isMirror(TreeNode a, TreeNode b) {
23        if (a == null && b == null) return true;
24        if (a == null || b == null) return false;
25        return a.val == b.val
26            && isMirror(a.left, b.right)
27            && isMirror(a.right, b.left);
28    }
29}