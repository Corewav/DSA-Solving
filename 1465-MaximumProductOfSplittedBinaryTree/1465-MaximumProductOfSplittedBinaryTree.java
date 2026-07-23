// Last updated: 7/23/2026, 9:33:12 AM
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
    long total =0;
    long max =0;
    int MOD=1000000007;
    public int maxProduct(TreeNode root) {
        total = totalSum(root);
        dfs(root);
        return (int)(max % MOD);
    }
    public long totalSum(TreeNode root){
        if(root == null) return 0;
        return root.val +totalSum(root.left)+ totalSum (root.right);
    }
    public long dfs(TreeNode root){
        if(root == null) return 0;
        long left = dfs(root.left);
        long right = dfs(root.right);
        long sum = root.val + left + right;
        max = Math.max(max,sum*(total - sum));
        return sum;
    }
}