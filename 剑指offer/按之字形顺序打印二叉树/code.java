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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null) return list;
        Stack<TreeNode> stack1 = new Stack<>();//存储奇数层
        Stack<TreeNode> stack2 = new Stack<>();//存储偶数层
        int n = 1;//奇数表示奇数层，偶数表示偶数层
        stack1.push(pRoot);
        while(!stack1.empty() || !stack2.empty()){
            if(n % 2 == 1){
                ArrayList<Integer>ll = new ArrayList<>();
                while(!stack1.empty()){
                    if(stack1.peek().left != null) stack2.push(stack1.peek().left);
                    if(stack1.peek().right != null) stack2.push(stack1.peek().right);
                    ll.add(stack1.pop().val);
                }
                if(!ll.isEmpty()){
                    list.add(ll);
                    ll = null;
                    n++;
                }
            }else{
                ArrayList<Integer>ll = new ArrayList<>();
                while(!stack2.empty()){
                    if(stack2.peek().right != null) stack1.push(stack2.peek().right);
                    if(stack2.peek().left != null) stack1.push(stack2.peek().left);
                    ll.add(stack2.pop().val);
                }
                if(!ll.isEmpty()){
                    list.add(ll);
                    ll = null;
                    n++;
                }
            }
        }
        return list;
    }
}
