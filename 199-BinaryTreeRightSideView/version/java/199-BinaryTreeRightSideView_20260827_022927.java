// Last updated: 8/27/2026, 2:29:27 AM
1class Solution {
2    private void preOrder(TreeNode node, List<Integer> ans, int index) {
3        if(node != null) {
4            if(index >= ans.size())
5                ans.add(index, node.val);
6            else
7                ans.set(index, node.val);
8            preOrder(node.left, ans, index + 1);
9            preOrder(node.right, ans, index + 1);
10        }
11    }
12    public List<Integer> rightSideView(TreeNode root){
13        List<Integer> ans = new ArrayList<Integer>();
14        preOrder(root, ans, 0);
15        return ans;
16    }
17}