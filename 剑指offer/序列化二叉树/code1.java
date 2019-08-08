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
    String Serialize(TreeNode root) {//二叉树的序列化是指将树写入一个文件中
        StringBuffer s = new StringBuffer();
        if(root == null){
            s.append("null" + " ");
            return s.toString();
        } 
        s.append(root.val + " ");
        s.append(Serialize(root.left));
        s.append(Serialize(root.right));
        return s.toString();
    }
    int index = -1;
    TreeNode Deserialize(String str) {//二叉树的反序列化是指读取文件后重建同样的二叉树
        ++index;
        String[] s = str.split(" ");
        TreeNode root = null;
        if(!s[index].equals("null")){
            root = new TreeNode(Integer.valueOf(s[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        return root;
    }
}
