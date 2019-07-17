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
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        while(pHead1 != null){
            hashMap.put(pHead1,null);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null){
            if(!hashMap.containsKey(pHead2)){
                pHead2 = pHead2.next;
            }else{
                return pHead2;
            }
        }
        return null;
    }
}
