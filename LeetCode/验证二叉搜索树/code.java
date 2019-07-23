/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> list=new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        InOrder(root);
        for(int i = 1;i < list.size();i++){
            if(list.get(i - 1) >= list.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);
        list.add(root.val);
        InOrder(root.right);
    }
}
