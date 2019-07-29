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
    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        int depth = 0;
        deque.add(root);
        while(!deque.isEmpty()){
            int x = deque.size();
            for(int i = 0;i < x;i++){
                if(deque.peek().left != null){
                    deque.add(deque.peek().left);
                }
                if(deque.peek().right != null){
                    deque.add(deque.peek().right);
                }
                deque.poll();
            }
            depth++;
        }
        return depth;
    }
}
