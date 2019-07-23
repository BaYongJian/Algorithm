import java.util.*;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while(!deque.isEmpty()){
            if(deque.peek().left != null){
                deque.add(deque.peek().left);
            }
            if(deque.peek().right != null){
                deque.add(deque.peek().right);
            }
            list.add(deque.pollFirst().val);
        }
        return list;
    }
}
