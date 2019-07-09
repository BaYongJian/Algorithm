class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        for(int i = 1;i < lists.length;i++){
            lists[i] = mergeTwoLists(lists[i-1],lists[i]);
        }
        return lists[lists.length - 1];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)   return null;
        if (l1 == null)     return l2;
        if (l2 == null)     return l1;
        ListNode merged;
        if (l1.val > l2.val) {
            merged = l2;
            l2 = l2.next;
            merged.next = mergeTwoLists(l1, l2);
        } else {
            merged = l1;
            l1 = l1.next;
            merged.next = mergeTwoLists(l1, l2);
        }
        return merged;
    }
}
