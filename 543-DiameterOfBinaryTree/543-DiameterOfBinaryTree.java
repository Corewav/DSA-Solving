// Last updated: 7/23/2026, 9:34:03 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        DOBT (root);
        return max;    
        
    }
    private int DOBT(TreeNode root)
    {
        if(root == null)
        return 0;
        int L =DOBT(root.left);
        int R = DOBT(root.right);
        max = Math.max(max, L+R);
        return 1+Math.max(L,R);
    }
}