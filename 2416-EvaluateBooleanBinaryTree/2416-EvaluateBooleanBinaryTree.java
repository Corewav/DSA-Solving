// Last updated: 7/23/2026, 9:32:26 AM
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
    public boolean evaluateTree(TreeNode root) {
        if(root == null)
        return false;
        switch(root.val)
        {
            case 2:
            return evaluateTree(root.left) || evaluateTree(root.right);
            case 3:
            return evaluateTree(root.left) && evaluateTree(root.right);
            default:
            {
                boolean b= (root.val != 0);
                return b;
            }
        }
        
    }
}