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
    ArrayList<Integer> list = new ArrayList<Integer>();
    int pre = 0;//前一个节点的值
    int cur = 0;//和当前节点的值的大小一样的值的数量
    int max = 0;//最大数量
    public int[] findMode(TreeNode root) {
        InOrder(root);
        int size = list.size();
	    int[] ans = new int[size];
	    for(int i = 0; i < size; i++){
	        ans[i] = list.get(i);
	    }
	    return ans;
    }
    
     public void InOrder(TreeNode root){
         if(root == null) return;
         InOrder(root.left);
         //判断当前值与上一个值的关系, 更新 cur 和 pre         
         if(pre == root.val){
             cur++;
         }else{
             pre = root.val;
             cur = 1;
             
         }
         //判断当前数量与最大数量的关系, 更新 list 和 max
         if(cur == max){
             list.add(root.val);
         }else if(cur > max){
             list.clear();
             list.add(root.val);
             max = cur;
         }
         
         InOrder(root.right);
    }
}
