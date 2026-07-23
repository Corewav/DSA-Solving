// Last updated: 7/23/2026, 9:35:43 AM
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(root,targetSum,list,ans);
        return ans;
        
    }
    public void find(TreeNode root, int target,List <Integer> list,List <List<Integer>> ans){
        if(root==null){
            return ;
        }
        list.add(root.val);
        if(root.left==null && root.right==null && root.val == target){
            ans.add(new ArrayList<>(list));
        }
        find(root.left,target-root.val,list,ans);
        find(root.right,target-root.val,list,ans);
        list.remove(list.size()-1);

    }
}