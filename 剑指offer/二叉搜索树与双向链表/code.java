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
    TreeNode Head = null;
    TreeNode pre = null;
    public TreeNode Convert(TreeNode root) {
        if(root == null) return root;
        InOrder(root);
        return Head;
    }
    
    public void InOrder(TreeNode root){
        if(root == null) return;
        InOrder(root.left);
        if(pre == null){
            pre = root;
            Head = root;
        }else{
            pre.right = root;
            root.left = pre;
            pre = root;
        }
        InOrder(root.right);
    }
}
