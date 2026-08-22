// Last updated: 8/22/2026, 4:17:55 PM
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
17
18    public List<Integer> inorderTraversal(TreeNode root) {
19
20        List<Integer> result = new ArrayList<>();
21
22        inorder(root, result);
23
24        return result;
25    }
26
27    private void inorder(TreeNode node, List<Integer> result){
28
29        if(node == null){
30            return;
31        }
32
33        inorder(node.left, result);
34
35        result.add(node.val);
36
37        inorder(node.right, result);
38    }
39}