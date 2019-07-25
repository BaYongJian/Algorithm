/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    //传入的pHead不是头节点，而是一个具体的结点
    public ListNode deleteDuplication(ListNode pHead){
        ListNode preNode = null;
        ListNode curNode = pHead;
        while(curNode != null){
            if(curNode.next != null && curNode.val == curNode.next.val){
                int value = curNode.val;
                while(curNode.next != null && curNode.next.val == value){
                    curNode = curNode.next;
                }
                if(preNode == null){
                    pHead = curNode.next;
                }else{
                    preNode.next = curNode.next;
                }
            }else{
                preNode = curNode;
            }
            curNode = curNode.next;
        }
        return pHead;
    }
}
