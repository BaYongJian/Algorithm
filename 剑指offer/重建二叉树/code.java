/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length != in.length) return null;
        return ConstructTree(pre,in,0,pre.length - 1,0,in.length - 1);
    }
    
    public TreeNode ConstructTree(int[] pre,int[] in,int prestart,int preend,int instart,int inend){
        if(prestart>preend||instart>inend) return null;
        TreeNode root = new TreeNode(pre[prestart]);
        for(int i = instart; i <= inend;i++){
            if(pre[prestart] == in[i]){
                root.left = ConstructTree(pre,in,prestart + 1,prestart + i - instart,instart,i - 1);//其中"i - instart"表示左子树结点的个数
                root.right = ConstructTree(pre,in,prestart + i - instart + 1,preend,i + 1,inend);
                break;
            }
        }
        return root;
    }
}
