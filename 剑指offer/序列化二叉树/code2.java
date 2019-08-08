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
    String Serialize(TreeNode root) {
        if(root == null){
            return "null" + " ";
        } 
        String s = root.val + " ";
        s += Serialize(root.left);
        s += Serialize(root.right);
        return s;
    }
    
    TreeNode Deserialize(String str) {
        String[] ss = str.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(String s : ss){
            list.add(s);
        }
        return order(list);
    }
    
    public TreeNode order(ArrayList<String> list){
        String value = list.get(0);
        list.remove(0);
        if(value.equals("null")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(value));
        root.left = order(list);
        root.right = order(list);
        return root;
    }
}
