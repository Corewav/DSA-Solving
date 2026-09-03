// Last updated: 9/3/2026, 9:24:27 PM
1public class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3        return rightSum(root);
4    }
5    
6    private int leftSum(TreeNode node) {
7        if (node == null)
8            return 0;
9        if (node.left == null && node.right == null)
10            return node.val;
11        return leftSum(node.left) + rightSum(node.right);
12    }
13    
14    private int rightSum(TreeNode node) {
15        if (node == null || (node.left == null && node.right == null))
16            return 0;
17        return leftSum(node.left) + rightSum(node.right);
18    }
19}