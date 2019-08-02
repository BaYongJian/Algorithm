public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        int lefthigh = High(root.left);
        int righthigh = High(root.right);
        return (Math.abs(lefthigh - righthigh) <= 1)
            && IsBalanced_Solution(root.left)
            && IsBalanced_Solution(root.right);
    }
    
    public int High(TreeNode root){
        if(root == null) return 0;
        return 1 + (Math.max(High(root.left),High(root.right)));
    }
}
