/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
     public ListNode removeElements(ListNode head, int val) {
         ListNode dumyHead = new ListNode(0);
         dumyHead.next = head;
         head =dumyHead;
         while(head!=null && head.next != null){
             if(head.next.val == val){
                 ListNode nextNode = head.next;
                 head.next = nextNode.next;
             }else{
                 head = head.next;
             }
         }
         return dumyHead.next;
    }
}
