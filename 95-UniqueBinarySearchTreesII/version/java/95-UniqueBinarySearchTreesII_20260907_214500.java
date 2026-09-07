// Last updated: 9/7/2026, 9:45:00 PM
1class Solution {
2    public List<TreeNode> helper(int l, int r){
3        List<TreeNode> x = new ArrayList<>();
4        if(l>r){  
5            x.add(null);
6            return x;
7        }
8        for(int i=l;i<=r;i++){
9            List<TreeNode> left = helper(l,i-1);
10            List<TreeNode> right = helper(i+1,r);
11            for(int j=0;j<left.size();j++){
12                for(int k=0;k<right.size();k++){
13                    TreeNode temp = new TreeNode(i,null,null);
14                    temp.left = left.get(j);
15                    temp.right = right.get(k);
16                    x.add(temp);
17                }
18            }
19        }
20        return x;
21    }
22    public List<TreeNode> generateTrees(int n){
23        return helper(1,n);
24    }
25}