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
    ArrayList<ArrayList<Integer>> list =  new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return list;
        int sum = 0;
        findpath(root,target,sum,new ArrayList<>());
        return list;
    }
    
    public void findpath(TreeNode root,int target,int sum,ArrayList list1){
        if(root != null) {
            list1.add(root.val);
            sum += root.val;
            if(sum == target && root.left == null && root.right == null){
                list.add(new ArrayList(list1));//因为add添加的是引用，如果不new一个的话，后面的操作会更改这个list
            }else if(sum < target){
                findpath(root.left,target,sum,list1);
                findpath(root.right,target,sum,list1);
            }
            list1.remove(list1.size() - 1);
        }
    }
}
