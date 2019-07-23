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
    boolean isSymmetrical(TreeNode pRoot)
    {
        return Same(pRoot,pRoot);
    }
    boolean Same(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null) return true;
        if(t1==null||t2==null) return false;
        if(t1.val==t2.val) return Same(t1.left,t2.right) && Same(t1.right,t2.left);//左子树和右子树比较，右子树和左子树比较
        else return false;
    }
}
