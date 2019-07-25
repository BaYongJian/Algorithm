import java.util.*;
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null || k == 0) return null;
        Stack<ListNode> stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        
        for(int i = 0;i < k - 1;i++){
            stack.pop();
            if(stack == null) return null;
        }
        if(stack.isEmpty()) return null;
        return stack.pop();
    }
}
