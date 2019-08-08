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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();//存储奇数层
        Stack<TreeNode> stack2 = new Stack<>();//存储偶数层
        int layer  = 1;//奇数表示奇数层，偶数表示偶数层
        stack1.push(root);
        while(!stack1.empty() || !stack2.empty()){
            List<Integer>ll = new ArrayList<>();
            if(layer % 2 == 1){
                while(!stack1.empty()){
                    if(stack1.peek().left != null) stack2.push(stack1.peek().left);
                    if(stack1.peek().right != null) stack2.push(stack1.peek().right);
                    ll.add(stack1.pop().val);
                }
                if(!ll.isEmpty()){
                    list.add(ll);
                    ll = null;
                    layer++;
                }
            }else{
                while(!stack2.empty()){
                    if(stack2.peek().right != null) stack1.push(stack2.peek().right);
                    if(stack2.peek().left != null) stack1.push(stack2.peek().left);
                    ll.add(stack2.pop().val);
                }
                if(!ll.isEmpty()){
                    list.add(ll);
                    ll = null;
                    layer++;
                }
            }
        }
        return list;
    }
}
