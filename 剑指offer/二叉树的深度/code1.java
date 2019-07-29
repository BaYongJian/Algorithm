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
    public int TreeDepth(TreeNode root) {
        return root == null ? 0 : TreeDepth(root.left) > TreeDepth(root.right) ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
    }
}
