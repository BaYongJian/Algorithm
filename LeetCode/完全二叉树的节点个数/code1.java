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
    int x = 0;
    public int countNodes(TreeNode root) {
        Inorder(root);
        return x;
    }
    
    public void Inorder(TreeNode root){
        if(root == null) return;
        Inorder(root.left);
        x++;
        Inorder(root.right);
    }
}
