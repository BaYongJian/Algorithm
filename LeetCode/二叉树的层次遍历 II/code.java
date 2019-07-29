/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        Stack<List<Integer>> stack = new Stack<>();
        int temp = 0;
        if(root == null) return ll;
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while(!deque.isEmpty()){
            int x = deque.size();
            ArrayList<Integer>list = new ArrayList<>();
            for(int i = 0;i < x;i++){
                if(deque.peek().left != null){
                    deque.add(deque.peek().left);
                }
                if(deque.peek().right != null){
                    deque.add(deque.peek().right);
                }
                list.add(deque.poll().val);
            }
            stack.push(list);
            temp++;
        }
        for(int i = 0;i < temp;i++){
                ll.add(stack.pop());
        }
        return ll;
    }
}
