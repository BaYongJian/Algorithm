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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> llist = new ArrayList<>();
        if(pRoot == null) return llist;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(pRoot);
        while(!deque.isEmpty()){
            int len = deque.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < len;i++){
                if(deque.peek().left != null) deque.add(deque.peek().left);
                if(deque.peek().right != null) deque.add(deque.peek().right);
                list.add(deque.poll().val);
            }
            llist.add(list);
        }
        return llist;
    }
}
