/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode s,TreeNode t) {
    if(s == null || t == null) return false;
    if(s.val == t.val){
        return Same(s,t) || HasSubtree(s.left,t) || HasSubtree(s.right,t);
    }
    return HasSubtree(s.left, t) || HasSubtree(s.right, t);
    }
    
    public boolean Same(TreeNode l, TreeNode r){
        if(l == null && r != null) return false;
        if(r == null) return true;
        if(l.val == r.val){
            return Same(l.left,r.left) && Same(l.right,r.right);
        }
        return false;
    }
}
