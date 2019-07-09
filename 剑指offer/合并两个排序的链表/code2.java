/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dum=new ListNode(0);//新建一个链表dum，dum.val = 0，dum.next = null
        ListNode list = dum;
         while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                list.next = list1;
                list1 = list1.next;
            }else{
                list.next = list2;
                list2 = list2.next;
            }
             list = list.next;
        }
        if (list1 == null){
            list.next = list2;
        }
        if (list2 == null){
            list.next = list1;
        }
        return dum.next;//因为新建的时候dum.val = 0,所以应该从dum.next开始输出。
    }
}
