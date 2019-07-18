/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/

public class Solution {
    public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null) return null;
        
        //在旧链表中创建新链表，此时不关注随机指针
        RandomListNode current = pHead;
        while(current != null){
            RandomListNode cloneNode = new RandomListNode(current.label);
            cloneNode.next = current.next;
            current.next = cloneNode;
            current = cloneNode.next;
        }
        
        //根据旧链表中的随机指针，初始化新链表中的随机指针
        current = pHead;
        //注意：每次跳两步，最后一步刚好跳在尾结点的后一位null上
        while(current != null){
            current.next.random = (current.random == null) ? null : current.random.next;
            current = current.next.next;
        }
        
        //删去旧链表。
        current = pHead;
        RandomListNode NewHead = pHead.next;
        while(current != null){
            RandomListNode cloneNode = current.next;
            current.next = cloneNode.next;
            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
            current = current.next;
        }
        return NewHead;
    }
}
