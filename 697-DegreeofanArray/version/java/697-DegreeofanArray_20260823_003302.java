// Last updated: 8/23/2026, 12:33:02 AM
1class Solution {
2    public TreeNode searchBST(TreeNode root, int x){
3        if(root==null || root.val==x)
4            return root;
5        if(root.val > x){
6            return searchBST(root.left,x);
7        }
8        if(root.val<x){
9            return searchBST(root.right,x);
10        }
11        return null;
12    }
13}