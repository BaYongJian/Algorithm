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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        else if(s == null || t == null) return false;
        else if(s.val == t.val){
            return Same(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    
    public boolean Same(TreeNode s,TreeNode t){
        if(s == null && t == null) return true;
        else if(s == null || t == null) return false;
        else if(s.val == t.val){
            return Same(s.left,t.left) && Same(s.right,t.right);
        }
        return false;
    }
}
