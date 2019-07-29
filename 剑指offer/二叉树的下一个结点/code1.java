import java.util.*;
/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    ArrayList<TreeLinkNode> list = new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        TreeLinkNode node = pNode;
        TreeLinkNode root = pNode;
        while(node.next != null){
            root = node.next;
            node = node.next;
        }
        Inorder(root);
        for(int i = 0;i < list.size() - 1;i++){
            if(list.get(i) == pNode) return list.get(i + 1);
        }
        return null;
    }
    
    public void Inorder(TreeLinkNode root){
        if(root == null) return;
        Inorder(root.left);
        list.add(root);
        Inorder(root.right);
    }
}
