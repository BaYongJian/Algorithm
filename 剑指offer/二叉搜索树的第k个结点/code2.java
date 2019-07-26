import java.util.*;
/*
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
    ArrayList<TreeNode> list = new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k){
        Inorder(pRoot);
        if(k == 0 || k > list.size()) return null;
        return list.get(k - 1);
    }
    
    void Inorder(TreeNode root){
        if(root == null) return;
        Inorder(root.left);
        list.add(root);
        Inorder(root.right);
    }
}
