// Last updated: 7/23/2026, 9:35:32 AM
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
    int sum = 0;
    public int sumnumber(TreeNode root) {
        getLeafSum(root, 0);
        return sum;
    }
    public void getLeafSum(TreeNode root, int curNum){
        if(root == null){
            return;
        }
        curNum = curNum * 10 + root.val;
        if(root.left == null && root.right == null){
            sum += curNum;
            return;
        }
        getLeafSum(root.left, curNum);
        getLeafSum(root.right, curNum);
    }
    public int sumNumbers(TreeNode root){
        sumnumber(root);
        return sum;
    }
}