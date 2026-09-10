// Last updated: 9/10/2026, 10:16:03 PM
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
17    private int count=0;
18    public int[] subtree_order(TreeNode root){
19        if(root==null){
20        // total sum , total node
21            return new int[]{0,0};
22        }
23        int[] left=subtree_order(root.left);
24        int[] right=subtree_order(root.right);
25        int totalsum=left[0]+right[0]+root.val;
26        int totalnode=left[1]+right[1]+1;
27        if(totalsum/totalnode==root.val){
28            count++;
29        }
30        return new int[]{totalsum,totalnode};
31    }
32    public int averageOfSubtree(TreeNode root){
33        if(root == null){
34            return count;
35        }
36        subtree_order(root);
37        return count;
38    }
39}