/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//递归方式
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode list;
        if(list1.val > list2.val){
            list = list2;
            list2 = list2.next;
            list.next = Merge(list1,list2);
        }else{
            list = list1;
            list1 = list1.next;
            list.next = Merge(list1,list2);
        }
        return list;
    }
}
