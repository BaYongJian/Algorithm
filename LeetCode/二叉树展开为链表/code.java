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
    public void flatten(TreeNode root) {
        while (root != null) { 
            if(root.left == null) root = root.right;
            else{
                TreeNode tmp = root.left;
                while(tmp.right != null){
                    tmp = tmp.right;
                }
                tmp.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
    }
}
