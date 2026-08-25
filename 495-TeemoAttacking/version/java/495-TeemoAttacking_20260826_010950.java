// Last updated: 8/26/2026, 1:09:50 AM
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
17    public int total=0;
18    public int findTilt(TreeNode root) {
19       calcu(root);
20       return total;    
21    }
22    public  int calcu(TreeNode root){
23        if(root == null){
24            return 0;
25        }
26        int leftchild = calcu(root.left);
27        int rightchild = calcu(root.right);
28        int tilt = Math.abs(leftchild - rightchild);
29        total = total + tilt;
30        return leftchild+rightchild+ root.val;
31    }
32
33}