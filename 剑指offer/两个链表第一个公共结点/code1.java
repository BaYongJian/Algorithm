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
        if(pHead1 == null || pHead2 == null) return null;
        int len1 = ListSize(pHead1);
        int len2 = ListSize(pHead2);
        if(len1 > len2){
            for(int i = 0; i < (len1 - len2);i++){
                pHead1 = pHead1.next;
            }
        }else{
            for(int i = 0; i < (len1 - len2);i++){
                pHead2 = pHead2.next;
            }
        }
        while(pHead1.val != pHead2.val && pHead1.next != null && pHead2.next != null){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
            
        }
        return pHead1.val == pHead2.val ? pHead1 : null;
    }
    public int ListSize(ListNode pHead){
        int i = 0;
        while(pHead != null){
            i++;
            pHead = pHead.next;
        }
        return i;
    }
}
